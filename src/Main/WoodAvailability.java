package Main;

import java.util.Arrays;
import java.util.List;

public class WoodAvailability {
      
    String[] WoodStorage = {"Cherry", "Oak", "Walnut", 
       "Maple", "Pine", "Cedar", 
       "Ash", "Bamboo", "Akasa", 
       "Teak", "Poplar", "Redwood", 
       "Beech"};
    
    public static final double cherryInchPrice = 0.44;
    public static final double oakInchPrice = 0.30;
    public static final double walnutInchPrice = 0.74;
    public static final double mapleInchPrice = 0.41;
    public static final double pineInchPrice = 0.54;
    public static final double cedarInchPrice = 0.24;
    public static final double ashInchPrice = 0.94;
    public static final double bambooInchPrice = 0.82;
    public static final double akasaInchPrice = 0.90;
    public static final double teakInchPrice = 0.96;
    public static final double poplarInchPrice = 1.00;
    public static final double redwoodInchPrice = 0.60;
    public static final double beechInchPrice = 0.78;
    
    private int cherryAmount = 5;
    private int oakAmount = 5;
    private int walnutAmount = 5;
    private int mapleAmount = 5;
    private int pineAmount = 5;
    private int cedarAmount = 5;
    private int ashAmount = 5;
    private int bambooAmount = 5;
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
                       if(cedarAmount == 0){
                           return false;
                       }
                       break;    
                   case 6:
                       if(ashAmount == 0){
                           return false;
                       }
                       break;
                   case 7:
                       if(bambooAmount == 0){
                           return false;
                       }
                       break;
                   case 8:
                       if(akasaAmount == 0){
                           return false;
                       }
                       break;
                   case 9:
                       if(teakAmount == 0){
                           return false;
                       }
                       break;
                   case 10:
                       if(poplarAmount == 0){
                           return false;
                       }
                       break;
                   case 11:
                       if(redwoodAmount == 0){
                           return false;
                       }
                       break;
                   case 12:
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
  
  public double Price(int area, String woodType){
      double price = 0;
        for(int i = 0; i < WoodStorage.length; i++){
            
            if(woodType.equals(WoodStorage[i])){
                
                switch(i){
                    
                    case 0:                
                        price = area * cherryInchPrice;                    
                        break;
                    case 1:
                        price = area * oakInchPrice;
                        break;
                    case 2:
                        price = area * walnutInchPrice;
                        break;
                    case 3: 
                        price = area * mapleInchPrice;
                        break;
                    case 4: 
                        price = area * pineInchPrice;
                        break;
                    case 5:
                        price = area * cedarInchPrice;
                        break;
                    case 6: 
                        price = area * ashInchPrice;
                        break;
                    case 7:
                        price = area * bambooInchPrice;
                        break;
                    case 8:
                        price = area * akasaInchPrice;
                        break;
                    case 9: 
                        price = area * teakInchPrice;
                        break;
                    case 10:
                        price = area * poplarInchPrice;
                        break;
                    case 11:
                        price = area * redwoodInchPrice;
                        break;
                    case 12:
                        price = area * beechInchPrice;
                        break;
                    default:
                        break;
                }
            }
        }
     return price;   
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
