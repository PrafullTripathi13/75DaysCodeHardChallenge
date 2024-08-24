
#The below program is short about using Lambda function in the efficient way :-

X = "Figmates"
greet_user = lambda: f"Welcome to {X}!"

# Use the Corporate-level lambda function
print(greet_user())

# Define other functions that use the X variable
def get_Figmates_info():
  return f"{X} is a Python project."

def get_Figmates_author():
  return "Bard"

# Use the other functions
print(get_Figmates_info())
print(get_Figmates_author())


# output of the above program :-

# Welcome to Figmates!
# Figmates is a Python project.
# Bard