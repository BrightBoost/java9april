### Bank account

#### Set up necessities
- Create a class bank account
- Give it a name, an account number, a balance, and a minimum balance
- Give it two methods: withdraw and deposit. Withdraw should throw a custom exception (BalanceTooLowException) when the balance would go below the minimum balance. And it should not actually do the withdrawal.

#### Write tests
- Write two tests for deposit: with positive and with negative number. 
  - Does it behave like you'd expect it to? If not, adjust the implementation code
- Write three tests for withdraw: with positive, positive that would go below the minimum balance and a negative number.
  - Assert for the exception and adjust the withdraw method for any undesirable behavior.