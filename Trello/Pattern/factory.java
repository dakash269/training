public class ShapeFactory 
{
   public Shape getShape(String shapeType)
  {
      if(shapeType == null)
         return null;	
      if(shapeType.equalsIgnoreCase("FACEBOOK"))
         return new facebook();
      else if(shapeType.equalsIgnoreCase("TWITTER"))
         return new twitter();
      else if(shapeType.equalsIgnoreCase("LINKEDIN"))
         return new linkedin();
      else if(shapeType.equalsIgnoreCase("GOOGLE"))
         return new google();
      return null;
   }
}
