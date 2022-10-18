import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateUserTesting {

   @Test
    public void getName(){
       CreateUser user = new CreateUser("Bob","bob@yahoo.com", "11111111111");
       String name = user.getName();
       Assertions.assertEquals(name, "Bob");
   }


}
