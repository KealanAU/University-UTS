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

	def __init__(self, x , y, value, exit, north, east, south, west):
		self.location_x = x
		self.location_y = y
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
	location_map = None

	def __init__(self, x, y):
		self.width = x
		self.height = y
		self.location_map = [ [ None ] * self.width ] * self.height
		
	def get_position(self, x, y):
		if(self.location_map[x][y] != None):
			return self.location_map[y][x]
		return None

	def set_position(self, x, y, value, exit, north, east, south, west):
		print(x, y)
		self.location_map[x][y] = Position(x, y, value, exit, north, east, south, west)
		
	def get_height(self):
		return self.height

	def get_width(self):
		return self.width

def is_exit_validation(location_x, location_y, width, height, value):
	symbols = [" ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤",
			"└", "┴", "├", "┼"]
	
	north = False
	east = False
	south = False
	west = False

	for i, symbol in enumerate(symbols):
		if symbol == value:
			
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
				indecies = 4;
			
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
				indecies = 10;
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

	if(north == True):
		# if True move up (-1) on the y axis and see if the value is less than 0
		if(location_y - 1 < 0):
			return True

	if(east == True):
		# if True move to the right and see if the value is more than width (as starts with 0 must be equal or more)
		if((location_x + 1) + 1 > width):
			return True

	if(south == True):
	# if True move down and see if the value is more than maze height
		if((location_y + 1) + 1 > height):
			return True

	if(west == True):
	# if True move to the left and see if the value is less than maze 0 (as starts with 0 must be equal or more)
		if(location_x - 1 < 0):
			return True 

	return False

def direction_validation(value):
	symbols = [" ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤",
			"└", "┴", "├", "┼"]
	
	north = False
	east = False
	south = False
	west = False

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
				indecies = 4;
			
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
				indecies = 10;
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

	return {'north': north, 'east':east,'south':south, 'west':west}

def read_maze(filename):
	x_length = 0
	y_length = 0

	if(os.stat(filename).st_size==0):
		return Maze(x_length,y_length)

	with open(filename) as f1:
		output_arr = []
		
		for row_index, line in enumerate(f1):
			# Loops over length	
			arr = []
			line_stripped = line.strip('\n')
			
			for column_index, letter in enumerate(line_stripped):
				# loops over values in line
				arr.append(letter)
			
			output_arr.append(arr)

	x_length = len(output_arr)
	y_length = len(output_arr[0])

	output_maze = Maze(x_length, y_length)
	
	for i, rows in enumerate(output_arr):
		for j, column_values in enumerate(rows):
			can_exit = is_exit_validation(j, i, x_length, y_length, column_values)
			direction_dict = direction_validation(column_values)
			output_maze.set_position(j, i, column_values, can_exit, direction_dict['north'], direction_dict['east'], direction_dict['south'], direction_dict['west'])

	# print(output_maze.get_position(0,1).has_direction('north'))
	return output_maze


if __name__ == "__main__":
	#You can do whatever you want here.
	maze = read_maze('./test.txt')
	print(maze.get_position(0,0).has_direction('west'))
	# print(maze.get_position(0,0).is_exit())
	
	# print(Maze.get_position(1,1))
	
	pass