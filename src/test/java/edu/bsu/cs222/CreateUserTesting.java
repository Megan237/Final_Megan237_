package edu.bsu.cs222;

import edu.bsu.cs222.CreateUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateUserTesting {

   @Test
    public void getName(){
       CreateUser user = new CreateUser("Bob","bob@yahoo.com", "11111111111");
       String name = user.getName();
       Assertions.assertEquals(name, "Bob");
   }

   @Test
   public void getEmail(){
      CreateUser user = new CreateUser("Bob","bob@yahoo.com", "11111111111");
      String email = user.getEmail();
      Assertions.assertEquals(email, "bob@yahoo.com");
   }

   @Test
   public void getPhoneNumber(){
      CreateUser user = new CreateUser("Bob","bob@yahoo.com", "11111111111");
      String phoneNumber = user.getPhoneNumber();
      Assertions.assertEquals(phoneNumber, "11111111111");
   }

   @Test
   public void setName(){
      CreateUser user = new CreateUser("Bob","bob@yahoo.com", "11111111111");
      user.setName("Jim");
      String name = user.getName();
      Assertions.assertEquals(name, "Jim");
   }

   @Test
   public void setEmail(){
      CreateUser user = new CreateUser("Bob","bob@yahoo.com", "11111111111");
      user.setEmail("jim@yahoo.com");
      String email = user.getEmail();
      Assertions.assertEquals(email, "jim@yahoo.com");
   }

   @Test
   public void setPhone(){
      CreateUser user = new CreateUser("Bob","bob@yahoo.com", "11111111111");
      user.setPhoneNumber("0001112222");
      String phoneNumber = user.getPhoneNumber();
      Assertions.assertEquals(phoneNumber, "0001112222");
   }


}
