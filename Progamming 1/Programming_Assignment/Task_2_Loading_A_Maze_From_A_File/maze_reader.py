import sys, os

class Position:
	# Location 
	symbols = [" ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤",
			"└", "┴", "├", "┼"]

	can_north = False
	can_west = False
	can_south = False
	can_east = False
	
	can_exit = False
	
	player_location = False
	
	location_x = 0
	location_y = 0
	
	value = 0

	def __init__(self, row , column, value, exit, north, east, south, west):
		self.location_x = column
		self.location_y = row
		
		self.value = value
		
		self.can_exit = exit
		
		self.can_north = north
		self.can_east = east
		self.can_south = south
		self.can_west = west
		
	def has_direction(self, direction):
		if(direction == "north" and self.can_north == True):
			return True
		if(direction == "east" and self.can_east == True):
			return True
		if(direction == "south" and self.can_south == True):
			return True
		if(direction == "west" and self.can_west == True):
			return True

		return False

	def is_exit(self):
		# check over symbols to see if there is a path out 
		# for an exit based on if it can go -1 and it's northern most spot
		if(self.can_exit == True):
			return True
		return False


class Maze:
	# GameMap
	width = None
	height = None
	location_map = {}

	def __init__(self, x, y):
		self.width = y
		self.height = x
		self.location_map = {}
		
	def get_position(self, row, column):
		if(row >= self.height or column >= self.width):
				return None
		if(self.location_map[row,column] != None):
			return self.location_map[row,column]
		return None

	def set_position(self, row, column, value, exit, north, east, south, west):
		if(row >= self.height or column >= self.width):
			return None
		self.location_map[row,column] = Position(row, column, value, exit, north, east, south, west)
		# print(row, column, value)
		
	def get_height(self):
		return self.height

	def get_width(self):
		return self.width


def direction_validation(row, column, height, width, value):
	symbols = [" ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤",
			"└", "┴", "├", "┼"]
	
	north = False
	east = False
	south = False
	west = False
	can_exit = False
	
	for i, symbol in enumerate(symbols):
		if(symbol == value):
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
		if(row - 1 < 0):
			can_exit = True

	if(east == True):
		# if True move to the right and see if the value is more than width (as starts with 0 must be equal or more)
		if((column + 1) + 1 > width):
			can_exit = True

	if(south == True):
	# if True move down and see if the value is more than maze 	
		if((row + 1) + 1 > height):
			can_exit = True

	if(west == True):
	# if True move to the left and see if the value is less than maze 0 (as starts with 0 must be equal or more)
		if(column - 1 < 0):
			can_exit = True

	return {'north': north, 'east':east,'south':south, 'west':west, 'can_exit':can_exit}

def read_maze(filename):
	
	column_width = 0
	row_height = 0

	if(os.stat(filename).st_size==0):
		return Maze(row_height, column_width)

	with open(filename) as f1:
		output_arr = []
		
		for row_index, line in enumerate(f1):
			# Loops over length	
			arr = []
			line_stripped = line.strip('\n')
			# if line_stripped.isspace():
			# 	continue
			for column_index, letter in enumerate(line_stripped):
				# loops over values in line
				arr.append(letter)
			
			output_arr.append(arr)
	
	# print(output_arr)
	column_width = len(output_arr[0])
	row_height = len(output_arr)

	output_maze = Maze(row_height, column_width)
	
	for i, rows in enumerate(output_arr):
		for j, column_values in enumerate(rows):
			# print(i,j , rows, column_values)
			direction_dict = direction_validation(i, j, row_height, column_width, column_values)
			output_maze.set_position(i, j, column_values, direction_dict['can_exit'], direction_dict['north'], direction_dict['east'], direction_dict['south'], direction_dict['west'])
			print(output_maze.get_position(i,j).value, output_maze.get_position(0,0).value)

	# print(output_maze.get_position(0,1).has_direction('north'))
	return output_maze


if __name__ == "__main__":
	#You can do whatever you want here.
	maze = read_maze('./test.txt')
	print(maze.get_height())
	print(maze.get_width())
	# for j in range(maze.get_height()):
	# 	for k in range(maze.get_width()):
	# 		print(f"""{maze.get_position(j,k).value}, Row: {j}, Column: {k} North: {maze.get_position(j,k).has_direction('north')} East: {maze.get_position(j,k).has_direction('east')} South: {maze.get_position(j,k).has_direction('south')} West: {maze.get_position(j,k).has_direction('west')}""")
	
	pass