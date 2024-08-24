#The Below Program is about Encapsulation applied in python3
class Account:
    def __init__(self, name, balance):
        self.__name = name  # Private attribute
        self.__balance = balance  # Private attribute

    def get_balance(self):
        return self.__balance

    def deposit(self, amount):
        self.__balance += amount
        print("Deposited:", amount)

    def withdraw(self, amount):
        if amount <= self.__balance:
            self.__balance -= amount
            print("Withdraw:", amount)
        else:
            print("Insufficient balance")

account = Account("Alice", 1000) #Create an account object
print("Current balance:", account.get_balance()) #Access the balance through the public getter method

# Try to access private attributes (will result in an AttributeError)
# print(account.__name)  # Error
# print(account.__balance)  # Error

account.deposit(500) #Use public methods to interact with the account
account.withdraw(200)
print("Final balance:", account.get_balance())
