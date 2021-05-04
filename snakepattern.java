import java.awt.*;//

import javax.security.auth.x500.X500Principal;
class Fdem extends Frame//{
{
    Fdem(){

    }
    public void paint(Graphics g){

        int x=50,y=680;int k=1;
        int count=17,count1=0;
        M:
        for(int i=1;i<=10;i++){
            if(k==11){
                x-=70;
                k--;
            }
            else if(k==0){
                x+=70;
                k++;
            }
            for(int j=1;j<=10;j++){
                count1++;

                try{Thread.sleep(200);}
                catch(Exception e){}
            
                

                if(count1==count)break M;
                if(i%2==1){
                x+=70;
                k++;}
                else{
                    x-=70;
                    k--;

                }
            }y-=70;
        }g.drawString(""+k,x,y);
    }
}
class snakepattern{
    public static void main(String ar[]){
        Fdem f = new Fdem();
        f.setVisible(true);
        f.setBounds(200,0,900,700);
    }
}

    

