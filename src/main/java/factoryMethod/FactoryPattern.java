package factoryMethod;

import factoryMethod.pizza.AmericanStore;
import factoryMethod.pizza.IndianStore;
import factoryMethod.pizza.Pizza;
import factoryMethod.pizza.PizzaStore;

public class FactoryPattern {

    public static void execute() {
        NotificationCreator emailCreator = new EmailNotificationCreator("abc@gmail.com", "abc@zoho.com");
        Notification emailNotification = emailCreator.getNotification();
        emailNotification.send("EMAIL WORLD");

        NotificationCreator smsCreator = new SmsNotificationCreator("999", "888");
        Notification smsNotification = smsCreator.getNotification();
        smsNotification.send("SMS WORLD");
    }

    public static void pizzaExecute() {
        PizzaStore americanStore = new AmericanStore();
        Pizza americanPizza = americanStore.orderPizza(Pizza.VEG);
        americanPizza.ready();

        PizzaStore indianStore = new IndianStore();
        Pizza indianPizza = indianStore.orderPizza(Pizza.NON_VEG);
        indianPizza.setName("Special-Delight");
        indianPizza.ready();
    }
}
