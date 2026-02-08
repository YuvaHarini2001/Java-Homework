
package singulylinkedlist;


public class ShoppingCart 
{
    Product head;
    
    void insertion(int productId, String productName, double price)
    {
        Product pr = new Product(productId,productName,price);
        
                if(head==null)
                {
                    head = pr;
                    return;
                }
                
                Product temp = head;
                
                while(temp.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = pr;      
    }
    
    void display()
     {
         Product temp= head;
         
         if(head==null)
         {
             System.out.println("List data is empty");
         }
         
         while(temp!=null)
         {
             System.out.println("*******Product Details*********");
             System.out.println("Product Id :"+temp.productId);
             System.out.println("Product Name:"+temp.productName);
             System.out.println("Price:"+temp.price);
             temp=temp.next;
         }
         
     }
}
