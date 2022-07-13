
class Shape:

    def __init__(self, num_sides):
        self.num_sides = num_sides

    def print_sides(self):
        print("I have " + str(self.num_sides) + " sides.")


class Triangle(Shape):  # something needs to go here

    def __init__(self):
        super().__init__(3)  # this needs to change


class Rectangle(Shape):  # something needs to go here

    def __init__(self):
        super().__init__(4)  # this needs to change


if __name__ == "__main__":
    pass  # you can add code here for testing