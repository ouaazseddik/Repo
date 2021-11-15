    package Pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.ui.Select;

    public class PizzaOrder {
       // WebDriver driver;
        WebDriver driver;

     //Constructor that will be automatically called as soon as the object of the class is created
     public PizzaOrder(WebDriver driver) {
      this.driver = driver;
     }


        By pizza1 =By.id("pizza1Pizza");
        By pizza1Toppings1 =   By.xpath("//div[@id='pizza1']//select[@class='toppings1']");
        By pizza1Toppings2 =  By.xpath ("//div[@id='pizza1']//select[@class='toppings2']");
        By pizza1Quantity  =  By.id("pizza1Qty");
        By pizza1Cost    =    By.id("pizza1Cost");
        By radioCreditCard =By.id("ccpayment");
        By radioCash       = By.id("cashpayment");
        By email      =    By.id("email");
        By name     = By.id("name");
        By phone    = By.id("phone");
        By placeOrderButton = By.id("placeOrder");
        By resetButton = By.id("reset");
        By  dialog  = By.id("dialog");
        By dialogText  =     By.xpath("//div[@id='dialog']/p");
         //Method to select a Message
        public  String  AlertDialog() {
         WebElement Dialog = driver.findElement(dialog);
         WebElement DialogText = driver.findElement(dialogText);
         System.out.println(DialogText.getText());
         String message = DialogText.getText();
        return message;
           }

          //Method to select a  pizza
         public void SelectPizza(int SelectPizza) {
         WebElement Pizza = driver.findElement(pizza1);
          //Selecting  from DropDown
         Select select = new Select(Pizza);
         select.selectByIndex(SelectPizza);

         }
         //Method to select a  Topping1
         public void SelectToppings1(int SelectTopping1) {
          WebElement Topping1 = driver.findElement(pizza1Toppings1);
          //Selecting  from DropDown
          Select select = new Select(Topping1);
          select.selectByIndex(SelectTopping1);

         }
         //Method to select a  Topping1
         public void SelectToppings2(int SelectTopping2) {
          WebElement Topping2 = driver.findElement(pizza1Toppings2);
          //Selecting  from DropDown
          Select select = new Select(Topping2);
          select.selectByIndex(SelectTopping2);

         }

         //Method to enter pizza Quantity
         public void enterPizzaQuantity(int pizzaQuantity) {
          driver.findElement(pizza1Quantity).clear();
          driver.findElement(pizza1Quantity).sendKeys(String.valueOf(pizzaQuantity));
         }
         //Method to enter name
         public void EnterName(String Name) {
          driver.findElement(name).sendKeys(Name);
         }
         //Method to enter email
         public void EnterEmail(String Email) {
          driver.findElement(email).sendKeys(Email);
         }
         //Method to enter phone number
         public void EnterPhoneNumber(String Phone) {
          driver.findElement(phone).sendKeys(Phone);
         }
         //Choose a credit card payment
         public void PaymentCreditCard() {
          driver.findElement(radioCreditCard).click();
         }
         //Choose a cash on pick up
         public void PaymentCashPickUp() {
          driver.findElement(radioCash).click();
         }
         //Place an order
         public void SubmitOrder() {
          driver.findElement(placeOrderButton).click();
         }
         //Reset
         public void ResetPage() {
          driver.findElement(resetButton).click();
         }
        }
