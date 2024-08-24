class CustomerError(Exception):
    "Base class for the custom errors."
class InvalidCustomerID(CustomerError):
    "Raised when a customer ID is invalid."
class InsufficientFunds(CustomerError):
    "Raised when a customer's balance is too low."

def process_order(customer_id, order_amount):
    if customer_id < 1000:
        raise InvalidCustomerID("Customer ID must be greater than or equal to 1000.")
    if order_amount > 500:
        raise InsufficientFunds("Insufficient funds for this order.")
    print("Order processed successfully!")

try:
    process_order(950, 400) #Will raise InvalidCustomerID
except CustomerError as e:
    print("Error:", e)

try:
    process_order(1234, 600) #Will raise InsufficientFunds
except CustomerError as e:
    print("Error:", e)
