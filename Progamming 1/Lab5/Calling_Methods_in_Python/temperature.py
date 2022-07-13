class temperature:

    temps = []

    def __init__(self, filename):
        self.readTemps(filename)

    def dayToIndex(self, day):
        days = {"Monday": 0,
                "Tuesday": 1,
                "Wednesday": 2,
                "Thursday": 3,
                "Friday": 4,
                "Saturday": 5,
                "Sunday": 6}
        return days[day]

    def readTemps(self, filename):
        file = open(filename)
        for line in file:
            self.temps.append(float(line))

    def getTemp(self, index):
        return self.temps[index]

    def average(self):
        return sum(self.temps)/len(self.temps)

    def high(self):
        return max(self.temps)

    def low(self):
        return min(self.temps)
