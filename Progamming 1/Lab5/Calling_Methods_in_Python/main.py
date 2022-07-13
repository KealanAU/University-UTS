import sys
from temperature import temperature

temps = temperature(sys.argv[1])

# Begin here!
# print(temps)
print(f"Monday was {temperature.getTemp(temps, temperature.dayToIndex(temps ,day='Monday'))}")
print(f"Tuesday was {temperature.getTemp(temps, temperature.dayToIndex(temps ,day='Tuesday'))}")
print(f"Wednesday was {temperature.getTemp(temps, temperature.dayToIndex(temps ,day='Wednesday'))}")
print(f"Thursday was {temperature.getTemp(temps, temperature.dayToIndex(temps ,day='Thursday'))}")
print(f"Friday was {temperature.getTemp(temps, temperature.dayToIndex(temps ,day='Friday'))}")
print(f"Saturday was {temperature.getTemp(temps, temperature.dayToIndex(temps ,day='Saturday'))}")
print(f"Sunday was {temperature.getTemp(temps, temperature.dayToIndex(temps ,day='Sunday'))}")

print(f"The maximum was {temperature.high(temps)}")
print(f"The minimum was {temperature.low(temps)}")
print(f"The average was {temperature.average(temps)}")

