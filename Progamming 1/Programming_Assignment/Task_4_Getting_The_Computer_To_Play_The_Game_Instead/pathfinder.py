
class Position:
	def __init__(self, north = False, east = False, south = False, west = False, exit = False):
		self.north = north
		self.east = east
		self.south = south
		self.west = west
		self.exit = exit


def can_escape(maze):
	if len(escape_route(maze)) == 0:
		return False
	else: 
		return True

def escape_route(maze):
	# start
	
	width = len(maze)
	height = len(maze[0])
	
	# tuple is x , y which is column, row
	start = (0, 0)
	
	# confirmed not
	explored = [start]
	
	# posibilities
	frontier = [start]

	dict_maze = dict()
	exit_cell = None

	for column_index, column in enumerate(maze): 
		for row_index, row in enumerate(column):
			# row is the value as well
			if row.exit == True:
				exit_cell = (column_index, row_index)

			dict_maze[column_index,row_index] = {'Obj':row, 'North':row.north, 'East':row.east, 'South':row.south, 'West':row.west, 'Exit':row.exit}

	
	path_out = dict()


	while len(frontier) > 0:

		current_cell = frontier.pop()
		if dict_maze[current_cell]['Exit'] == True:
			# breaks if found the exit
			break
		
		for direction in ['North', 'East', 'South', 'West']:
			# find child cell, and check over the direction options
			if dict_maze[current_cell][direction] == True:
				if direction == 'North':
					# Move North
					
					childCell = (current_cell[0] -1 , current_cell[1])
					
					
				elif direction == 'East':
					# Move East
					childCell = (current_cell[0], current_cell[1] + 1)
					
					
				elif direction == 'South':
					# Move South
					childCell = (current_cell[0] + 1, current_cell[1])
				
				elif direction == 'West':
					# Move West
					childCell = (current_cell[0], current_cell[1] - 1)
					
				
				if childCell in explored:
					# check if the child cell is present
					continue

				explored.append(childCell)
				frontier.append(childCell)
				
				# over rides if the direction doesn't provide the right way out
				path_out[childCell] = current_cell
		
		forward_path = dict()		
		
	if exit_cell == None:
		return []

	while exit_cell != start:

		forward_path[path_out[exit_cell]] = exit_cell
		exit_cell = path_out[exit_cell]	

	directions_out = []
	
	
	for row, column in reversed(forward_path):
		if(row > forward_path[(row,column)][0]):
			# next row is less than the current : y-axis
			
			directions_out.append('North')

		elif(column > forward_path[(row,column)][1]):
			# next column is less than the current : x-axis
			
			directions_out.append('West')
		
		elif(row < forward_path[(row,column)][0]):
			# next row is more than the current : y-axis
			directions_out.append('South')

		elif(column < forward_path[(row,column)][1]):
			# next column is less than the current : x-axis
			directions_out.append('East')		
	
		

	return forward_path



if __name__ == "__main__":

	# north, east, south , west, exit
	one_row_one = Position(False, False, True, False, False)
	one_row_two = Position(False, True, True, False, False)
	one_row_three = Position(False, False, False, True, False)
	one_row_four = Position(False, False, True, False, False)
	one_row_five = Position(False, True, True, False, False)
	one_row_six = Position(False, True, True, True, False)
	one_row_seven = Position(False, False, False, False, False)

	two_row_one = Position(True, True, True, False, False)
	two_row_two = Position(True, True, False, True, False)
	two_row_three = Position(False, True, False, True, False)
	two_row_four = Position(True, True, False, True, False)
	two_row_five = Position(True, False, False, True, False)
	two_row_six = Position(False, False, False, False, False)
	two_row_seven = Position(False, False, False, False, False)

	three_row_one = Position(False, True, False, False, False)
	three_row_two = Position(False, True, False, False, False)
	three_row_three = Position(False, True, False, False, False)
	three_row_four = Position(False, True, False, False, False)
	three_row_five = Position(False, True, False, False, False)
	three_row_six = Position(False, False, False, False, False)
	three_row_seven = Position(False, False, False, False, False)

	four_row_one = Position(True, False, True, False, False)
	four_row_two = Position(True, False, True, False, False)
	four_row_three = Position(True, False, True, False, False)
	four_row_four = Position(False, True, True, False, False)
	four_row_five = Position(True, True, True, False, False)
	four_row_six = Position(False, False, False, False, False)
	four_row_seven = Position(False, False, False, False, False)


	five_row_one = Position(False, True, False, False, False)
	five_row_two = Position(False, True, False, True, False)
	five_row_three = Position(False, True, False, True, False)
	five_row_four = Position(False, True, False, True, False)
	five_row_five = Position(True, True, True, False, True)
	five_row_six = Position(False, True, False, True, False)
	five_row_seven = Position(False, False, False, True, False)

	maze = [[one_row_one, one_row_two, one_row_three, one_row_four, one_row_five, one_row_six, one_row_seven], [two_row_one, two_row_two, two_row_three, two_row_four, two_row_five, two_row_six, two_row_seven], [three_row_one, three_row_two, three_row_three, three_row_four, three_row_five, three_row_six, three_row_seven], [four_row_one, four_row_two, four_row_three, four_row_four, four_row_five, four_row_six, four_row_seven],[five_row_one, five_row_two, five_row_three, five_row_four, five_row_five, five_row_six, five_row_seven]]


	print(can_escape(maze))
	pass