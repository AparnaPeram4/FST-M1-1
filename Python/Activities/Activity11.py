#Define dictionary 
fruit_shop = {
    "apple": 10,
    "banana":20,
    "orange":30,
    "Blueberry":20
}

fruit_to_check = input("What are you looking for ?:").lower()
if(fruit_to_check in fruit_shop):
    print("Yes this fruit available in the shop")
else:
    print("No this fruit is not available in the shop")     