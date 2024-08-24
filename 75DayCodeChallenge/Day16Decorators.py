
# Explain Decorators with an example :-
def decorator_func(func):
    def wrapper_func():
        print("Wrapper_func Worked")       #First Way:-
        return func()
    print("decorator_func Worked")
    return wrapper_func
def show():
    print("Show Worked")
decorator_show = decorator_func(show)
decorator_show()

# Output :-
#            decorator_func Worked
#            wrapper_func Worked
#            Show Worked

#-------------------------------------------------------------------------------------------------------#

@decorator_func
def display():
    print("Display Worked")      #Second Way :-
display()

# Output :-
#            decorator_func Worked
#            Wrapper_func Worked
#            Display Worked