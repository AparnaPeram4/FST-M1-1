#Get User Names
user1 = input("What is player1's name ? ")
user2 = input("what is player2's name ?")

#Looping endlessely
while True:

#Get User Choices 
    user1_answer = input(user1  + " Do you want to choose rock,paper or scissors ?").lower()
    user2_answer = input(user2  + " Do you want to choose rock,paper or scissors ?").lower()

# Run the game
    if user1_answer == user2_answer:
            print("Its a tie start again")
    elif user1_answer == 'rock':
            if user2_answer == 'scissors':
                 print(user1 + "Wins")
            else:
                 print(user2 + "Wins")    
    elif user1_answer == 'scissors':
             if user2_answer == 'paper':
                 print(user1 +"Wins")
             else:
                 print(user2 +"Wins")    
    elif user1_answer == 'paper':
                 if user2_answer == 'rock':
                     print(user1 +"Wins")
                 else:
                     print(user2 + "Wins")  
    else:
              print("Invalid input , please try again with valid input")                   

    #Ask user if they want to play the game again
    repeat = input("Would you like to play the game again ? : Yes/No").lower()

    #Don't do anything on Yes
    if(repeat=="yes"):
      pass
    #Exit the game on No
    elif(repeat=="no"):
         raise SystemExit

    # Error message on invalid input
    else:
        print("Invalid response , you should enter either 'Yes' or 'No'")
        raise SystemExit     