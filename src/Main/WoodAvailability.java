package Main;

public class WoodAvailability {
        
    String[] WoodStorage = {"Cherry", "Oak", "Walnut", 
       "Maple", "Pine", "Cedar", 
       "Ash", "Bamboo", "Akasa", 
       "Teak", "Poplar", "Redwood", 
       "Beech"};
        
    public static final double inchPrice = 0.44;
        
    private int cherryAmount = 5;
    private int oakAmount = 5;
    private int walnutAmount = 5;
    private int mapleAmount = 5;
    private int pineAmount = 5;
    private int akasaAmount = 5;
    private int teakAmount = 5;
    private int poplarAmount = 5;
    private int redwoodAmount = 5;
    private int beechAmount = 5;
    
  public boolean IsAvailable(String order){
    for(String item : WoodStorage){     
       if(order.equals(item)){
           for(int i = 0; i < WoodStorage.length; i++){
                if(item == WoodStorage[i]){
               switch(i){
                   case 0:
                       if(cherryAmount == 0){
                           return false;
                       }
                       break;
                   case 1:
                       if(oakAmount == 0){
                           return false;
                       }
                       break;
                   case 2:
                       if(walnutAmount == 0){
                           return false;
                       }
                       break;
                   case 3:
                       if(mapleAmount == 0){
                           return false;
                       }
                       break;    
                   case 4:
                       if(pineAmount == 0){
                           return false;
                       }
                       break;
                   case 5:
                       if(akasaAmount == 0){
                           return false;
                       }
                       break;    
                   case 6:
                       if(teakAmount == 0){
                           return false;
                       }
                       break;
                   case 7:
                       if(poplarAmount == 0){
                           return false;
                       }
                       break;
                   case 8:
                       if(redwoodAmount == 0){
                           return false;
                       }
                       break;
                   case 9:
                       if(beechAmount == 0){
                           return false;
                       }
                       break;
                   default:
                       break;
                }
                  
                }       
            }
           return true;
        }  
    }
    return false;
}
  
  public void Update(String order){
     if(IsAvailable(order) == true){
         System.out.println(order + " is available");
     }
     else{
         System.out.println(order + " is not available");
     }     
  }
  
  /*private void WoodAmountUpdate(Ordering user, String order){
      if(user.Verify() == true)
      {
          for(int i = 0; i < WoodStorage.length; i++){
               
           if(order == WoodStorage[i]){
               switch(i){
                   case 0:
                       cherryAmount = cherryAmount - 1;
                       break;
                   case 1:
                       oakAmount = oakAmount - 1;
                       break;
                   case 2:
                       walnutAmount = walnutAmount - 1;
                       break;
                   case 3:
                       mapleAmount = mapleAmount - 1;
                       break;    
                   case 4:
                       pineAmount = pineAmount - 1;
                       break;
                   case 5:
                       akasaAmount = akasaAmount - 1;
                       break;    
                   case 6:
                       teakAmount = teakAmount - 1;
                       break;
                   case 7:
                       poplarAmount = poplarAmount - 1;
                       break;
                   case 8:
                       redwoodAmount = redwoodAmount - 1;
                       break;
                   case 9:
                       beechAmount = beechAmount - 1;
                       break;
                   default:
                       break;
               }
           }
               
        }
      }
  }*/
}
