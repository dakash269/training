public class FactoryPatternDemo 
{
   public static void main(String[] args) 
   {
      ShapeFactory social = new ShapeFactory();
      Shape shape1 = social.getShape("FACEBOOK");
      shape1.login(facebook);
      Shape shape2 = social.getShape("TWITTER");
      shape2.login(twitter);
      Shape shape3 = social.getShape("LINKEDIN");
      shape3.login(linkedin);
      Shape shape4 = social.getShape("GOOGLE");
      shape4.login(google);
   }
}
