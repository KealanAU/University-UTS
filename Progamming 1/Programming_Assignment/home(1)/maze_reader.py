import sys, os


class Position:
	symbols = [" ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤",
			"└", "┴", "├", "┼"]
	option_north = False
	option_east = False
	option_south = False
	option_west = False
	
	option_exit = False

	symbol_val = None

	row_location = None
	column_location = None

	def __init__(self, row : int, column: int, symbol:str, options:dict) -> None:
		self.row_location = row
		self.column_location = column

		self.option_north = options['opt_north']
		self.option_east = options['opt_east']
		self.option_south = options['opt_south']
		self.option_west = options['opt_west']

		self.symbol_val = symbol

		self.option_exit = options['opt_exit']
		pass

	def has_direction(self, direction):
		
		if(direction == "north" and self.option_north == True):
			return True
		elif(direction == "east" and self.option_east == True):
			return True
		elif(direction == "south" and self.option_south == True):
			return True
		elif(direction == "west" and self.option_west == True):
			return True
		else:
			return False

	def is_exit(self):
		if(self.option_exit == True):
			return True
		return False

class Maze:
	# declare class attributes
	maze_width = None
	maze_height = None

	maze_map_arr = None

	def __init__(self, n_rows_height:int, n_columns_width:int) -> None:
		# set values
		self.maze_height = n_rows_height
		
		self.maze_width = n_columns_width
		
		# build maze for storing values
		self.maze_map_arr = [ [ None ] * self.maze_width ] * self.maze_height

	def get_position(self, row, column):
		# rows then colums
		if(row >= self.maze_height or column >= self.maze_width):
			return None
		if(self.maze_map_arr[row][column] != None):
			return self.maze_map_arr[row][column]
		else:
			return None
	
	def set_position(self, n_row, n_column, symbol_value, opt_directions):
		# rows then colums
		if(n_row > self.maze_height or n_column > self.maze_width):
			return None
		self.maze_map_arr[n_row][n_column] = Position(n_row, n_column, symbol_value, opt_directions)


	def get_height(self):
		return self.maze_height

	def get_width(self):
		return self.maze_width

def compass_validation(row_y, column_x, maze_height, maze_width, symbol_value):
	symbols = [" ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤",
			"└", "┴", "├", "┼"]
	north = False
	east = False
	south = False
	west = False

	exit = False


	for i, symbol in enumerate(symbols):
		if(symbol == symbol_value):
			if(i == 1):
				## "╸" West
				north = False
				east = False
				south = False
				west = True

			elif(i == 2):
				## "╻" South
				north = False
				east = False
				south = True
				west = False
			
			elif(i == 3):

				## "┓" South West
				north = False
				east = False
				south = True
				west = True
			
			elif(i == 4):

				## "╺" East
				north = False
				east = True
				south = False
				west = False
			
			elif(i == 5):

				## "━" East West
				north = False
				east = True
				south = False
				west = True
							
			elif(i == 6):

				## "┏" South East
				north = False
				east = True
				south = True
				west = False
								
			elif(i == 7):

				## "┳" South East West
				north = False
				east = True
				south = True
				west = True
							
			elif(i == 8):
				## "╹" North
				north = True
				east = False
				south = False
				west = False
		
			elif(i == 9):

				## "┛" North West
				
				north = True
				east = False
				south = False
				west = True
			
			elif(i == 10):

				## "┃" North South
				north = True
				east = False
				south = True
				west = False
			
			elif(i == 11):

				## "┫" North South West
				north = True
				east = False
				south = True
				west = True
								
			elif(i == 12):

				## "┗" North East
				north = True
				east = True
				south = False
				west = False
								
			elif(i == 13):

				## "┻" North East West
				north = True
				east = True
				south = False
				west = True

			elif(i == 14):

				## "┣" North East South
				north = True
				east = True
				south = True
				west = False
		
			elif(i == 15):

				## "╋" North East South West
				north = True
				east = True
				south = True
				west = True
			else: 
				north = False
				east = False
				south = False
				west = False 

	# establish can_exit
	if(north == True):
	# if True move up (-1) on the y axis and see if the value is less than 0
		if(row_y - 1 < 0):
			exit = True

	if(east == True):
		# if True move to the right and see if the value is more than width (as starts with 0 must be equal or more)
		if((column_x + 1) + 1 > maze_width):
			exit = True

	if(south == True):
	# if True move down and see if the value is more than maze height
		if((row_y + 1) + 1 > maze_height):
			exit = True

	if(west == True):
	# if True move to the left and see if the value is less than maze 0 (as starts with 0 must be equal or more)
		if(column_x - 1 < 0):
			exit = True

	return {'opt_north': north, 'opt_east':east,'opt_south':south, 'opt_west':west, 'opt_exit':exit}

def read_maze(filename):
	cleaned_maze_vals = []
	if(os.stat(filename).st_size==0):
		return Maze(0, 0)
	with open(filename) as file: 
		for rows in file:
			row = []
			for columns in rows.strip('\n'):
				print(columns)
				row.append(columns)
			if not rows.strip('\n').isspace():
				cleaned_maze_vals.append(row)

	
	n_column_width = len(cleaned_maze_vals[0])
	n_rows_height = len(cleaned_maze_vals)
	
			
	output_maze = Maze(n_rows_height, n_column_width)
	
	for row_index, row_value in enumerate(cleaned_maze_vals):
		for column_index, column_value in enumerate(row_value):

			symbol = cleaned_maze_vals[row_index][column_index]
			output_maze.set_position(row_index, column_index, symbol, compass_validation(row_index, column_index, n_rows_height, n_column_width, symbol))

	return output_maze

if __name__ == "__main__":
	#You can do whatever you want here.
	maze_to_test = ['./one_maze.txt', './nothing.txt', './two_maze.txt','./three_maze.txt', './test.txt', './new_line.txt']
	maze_to_test = ['./new_line.txt']

	for i in maze_to_test:
		
		maze = read_maze(i)
		print(maze.get_height())
		print(maze.get_width())
		for j in range(maze.get_height()):
			for k in range(maze.get_width()):
				print(f"""{maze.get_position(j,k).symbol_val}, Row: {j}, Column: {k}
North: {maze.get_position(j,k).has_direction('north')}
East: {maze.get_position(j,k).has_direction('east')}
South: {maze.get_position(j,k).has_direction('south')}
West: {maze.get_position(j,k).has_direction('west')}
				""")