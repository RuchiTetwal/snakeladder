import javax.swing.*;//
import java.awt.*;//
import java.awt.event.*;//

class message{
	JFrame m;
	message(){
		m= new JFrame();
		JOptionPane.showMessageDialog(m,"Please press START button");
	}
}

class FDemo extends JFrame//
{
	JPDemo jp1;//
	FDemo()//
	{
	  super.setTitle("Snake & Ladder");//	
	 jp1=new JPDemo();//
     add(jp1);	 //
		
	}//		
		
}//
class JPDemo extends JPanel implements ActionListener//
{//1
	ImageIcon img1,img3,img4;//
	ImageIcon img6,img7;//
	ImageIcon img8,img9;//
	ImageIcon img10,img11,imgG;//
	
	Image board,s1,start;//
	
	Image player1,player2;//
	Image player11,player12;//
	Image dice,dice1,Game;//
	
	JButton b1,b2,b3,b4;//
	JTextField tx1,tx2,tx3;//
	
	int px1=40;//
	int py1=620;//
	int px2=120;
	int py2=620;

	int count=0,count2=0,k=1;
	int count1=0,count_2=0;

	int chance=0;

	boolean gameover=false,gamestart=false;	
	JPDemo()
	{//2

		Font f1= new Font("Copperplate Gothic Bold",Font.BOLD,36);
		setFont(f1);
		setBackground(Color.black);//
	    
		img1=new ImageIcon("board.jpg");//
		img3=new ImageIcon("s1.png");//
		img4=new ImageIcon("start.jpg");//
		img6=new ImageIcon("reset.png");//
		img7=new ImageIcon("start.gif");//
		
		img8=new ImageIcon("player1.png");//
		img9=new ImageIcon("player2.png");//
		
		img10=new ImageIcon("dice.gif");//
		img11=new ImageIcon("dice.png");//

		imgG=new ImageIcon("GameOver.png");//
		
		board=img1.getImage();
		s1=img3.getImage();//
		start=img4.getImage();//
		
		player1=img8.getImage();//
		player2=img9.getImage();//
		
		dice=img10.getImage();//
		dice1=img11.getImage();//
		
		player11=img8.getImage();//
		player12=img9.getImage();//

		Game=imgG.getImage();
		
		setLayout(null);//
		
		b2=new JButton(img6);//
		b2.setBounds(50,70,100,30);//
		add(b2);//
	    b2.setBackground(new Color(4,129,255));//
		b2.addActionListener(this);//
		
		Font f=new Font("Bauhaus 93",Font.ITALIC,20);//
		
		tx1=new JTextField("Start Game");//
		tx1.setBounds(50,120,140,35);//
		add(tx1);//
		tx1.setBackground(Color.black);//
	    tx1.setForeground(Color.green);//
		tx1.setFont(f);//
		
		tx2=new JTextField("Player 1 Name");//
		tx2.setBounds(50,220,140,35);//
		add(tx2);//
		tx2.setBackground(Color.black);//
	    tx2.setForeground(Color.green);//
		tx2.setFont(f);//
		
		tx3=new JTextField("Player 2 Name");//
		tx3.setBounds(50,305,140,35);//
		add(tx3);//
		tx3.setBackground(Color.black);//
	    tx3.setForeground(Color.green);//
		tx3.setFont(f);//
		
		b3=new JButton("Roll");//
		b3.setBounds(50,430,100,30);//
		add(b3);//
		b3.setFont(f);//
	    b3.setForeground(Color.red);//
		
		b3.addActionListener(this);//
		
		b4=new JButton(img7);//
		b4.setBounds(20,560,150,60);//
		add(b4);//
		b4.setFont(f);//
	    b4.setForeground(Color.red);//
		b4.addActionListener(this);//
	}//2
	public void paintComponent(Graphics g)//
	{//2
		super.paintComponent(g);//
		
		g.setColor(new Color(4,129,255));//
		g.fillRect(0,0,200,735);//
	    g.drawImage(board,200,0,this);//
		g.drawImage(s1, 920,0,this);//
		g.drawImage(start,20,550,this);//

		g.drawImage(player11,10,210,this);//
		g.drawImage(player12,10,290,this);//
			
		g.drawImage(dice,10,350,this);//
		g.drawImage(dice1,110,360,this);//

		g.drawImage(player1,px1,py1,this);//	
		g.drawImage(player2,px2,py2,this);//

		try{Thread.sleep(100);}
		catch(Exception ex){}

		if(gameover==true){//3
			g.drawImage(Game,200,200,this);
			if(count==100){//4
				g.drawString(tx2.getText()+" WIN'S",350,400);
			}//4
			else if(count2==100){//4
				g.drawString(tx3.getText()+" WIN'S",350,400);
			}//4
			else if(count==100&&count2==100){//4
				g.drawString("GAME TIE'S",350,400);
			}//4
		}//3
	}//2
	public void actionPerformed(ActionEvent e)
	{//2	
		if(e.getSource()==b4){
			gamestart=true;
			tx1.setText(tx2.getText()+" chance");
		}

		if(gamestart==true){
	
	
		if(e.getSource()==b2){
			tx1.setText("Start game");
			count=0;
			count2=0;
			k=1;
			count1=0;
			count_2=0;
			 px1=40;//
			 py1=620;//
			 px2=120;
			 py2=620;
			 repaint();
			 gameover=false;
			
		}
		if(gameover!=true){//3

		if(e.getSource()==b3)//
		{//4
			
			int random=(int)Math.round(Math.random()*5+1);//
			chance++;

			if(chance%2!=0){//5

			switch(random)//
			{//6
				case 1://
				img11=new ImageIcon("dice1.png");//
				if(count+1<=100){//7
				count+=1;}//7
				break;//
				case 2://
				img11=new ImageIcon("dice2.png");//
				if(count+2<=100){//7
				count+=2;}//7
				break;//
				case 3://
				img11=new ImageIcon("dice3.png");//
				if(count+3<=100){
				count+=3;}
				break;//
				case 4://
				img11=new ImageIcon("dice4.png");//
				if(count+4<=100){
				count+=4;}
				break;//
				case 5://
				img11=new ImageIcon("dice5.png");//
				if(count+5<=100){
				count+=5;}
				break;//
				case 6://
				img11=new ImageIcon("dice6.png");//
				if(count+6<=100){
				count+=6;}
				break;//
			}//6
					dice1=img11.getImage();//

		k=1;
		px1=210;
		py1=645;
		count1=0;	
		
		int flag=0;
		
		M:
        for(int i=1;i<=10;i++){//6
			
            if(k==11){
                px1-=70;
                k--;
            }
            else if(k==0){
                px1+=70;
                k++;
            }
            for(int j=1;j<=10;j++){//7
                count1++;
            				

				try{Thread.sleep(10);}
                catch(Exception ex){}

				repaint();
				if(count==100||count2==100){//3
					gameover=true;
					tx1.setText("Game Over");
				}//3

				tx1.setText(tx3.getText()+" chance");
                if(count1==count)break M;
                if(i%2==1){
                px1+=70;
                k++;}
                else{
                    px1-=70;
                    k--;

                }
            }py1-=70;//7
        }//6
	
		if(count==99){count=41;flag=1;}
		else if(count==89){count=53;flag=1;}
		else if(count==76){count=58;flag=1;}
		else if(count==66){count=45;flag=1;}
		else if(count==54){count=31;flag=1;}
		else if(count==43){count=18;flag=1;}
		else if(count==40){count=3;flag=1;}
		else if(count==27){count=5;flag=1;}
		else if(count==4){count=25;flag=1;}
		else if(count==13){count=46;flag=1;}
		else if(count==33){count=49;flag=1;}
		else if(count==42){count=63;flag=1;}
		else if(count==50){count=69;flag=1;}
		else if(count==62){count=81;flag=1;}
		else if(count==74){count=92;flag=1;}

		if(flag==1){//6
			k=1;
			px1=210;
			py1=645;
			count1=0;	
		M:
        for(int i=1;i<=10;i++){//7
			
            if(k==11){
                px1-=70;
                k--;
            }
            else if(k==0){
                px1+=70;
                k++;
            }
            for(int j=1;j<=10;j++){//8
                count1++;
            				

				try{Thread.sleep(50);}
                catch(Exception ex){}

				repaint();
				if(count==100||count2==100){//3
					gameover=true;
					tx1.setText("Game Over");
				}//3

				tx1.setText(tx3.getText()+" chance");
                if(count1==count){break M;}
                if(i%2==1){
                px1+=70;
                k++;}
                else{
                    px1-=70;
                    k--;

                }
            }py1-=70;//8
        }//7
		}//6
	}//5
			else{//5

				switch(random)//
				{//6
					case 1://
					img11=new ImageIcon("dice1.png");//
					if(count2+1<=100){
					count2+=1;}
					break;//
					case 2://
					img11=new ImageIcon("dice2.png");//
					if(count2+2<=100){
					count2+=2;}
					break;//
					case 3://
					img11=new ImageIcon("dice3.png");//
					if(count2+3<=100){
					count2+=3;}
					break;//
					case 4://
					img11=new ImageIcon("dice4.png");//
					if(count2+4<=100){
					count2+=4;}
					break;//
					case 5://
					img11=new ImageIcon("dice5.png");//
					if(count2+5<=100){
					count2+=5;}
					break;//
					case 6://
					img11=new ImageIcon("dice6.png");//
					if(count2+6<=100){
					count2+=6;}
					break;//
				}
						dice1=img11.getImage();//
	
			k=1;
			px2=230;
			py2=645;
			count_2=0;
			
			int flag=0;
	
			
			M:
			for(int i=1;i<=10;i++){
				
				if(k==11){
					px2-=70;
					k--;
				}
				else if(k==0){
					px2+=70;
					k++;
				}
				for(int j=1;j<=10;j++){
					count_2++;
								
	
					try{Thread.sleep(10);}
					catch(Exception ex){}
	
					repaint();
					if(count==100||count2==100){//3
						gameover=true;
						tx1.setText("Game Over");
					}//3

					tx1.setText(tx2.getText()+" chance");
					if(count_2==count2)break M;
					if(i%2==1){
					px2+=70;
					k++;}
					else{
						px2-=70;
						k--;
	
					}
				}py2-=70;
			}
		
			if(count2==99){count2=41;flag=1;}
			else if(count2==89){count2=53;flag=1;}
			else if(count2==76){count2=58;flag=1;}
			else if(count2==66){count2=45;flag=1;}
			else if(count2==54){count2=31;flag=1;}
			else if(count2==43){count2=18;flag=1;}
			else if(count2==40){count2=3;flag=1;}
			else if(count2==27){count2=5;flag=1;}
			else if(count2==4){count2=25;flag=1;}
			else if(count2==13){count2=46;flag=1;}
			else if(count2==33){count2=49;flag=1;}
			else if(count2==42){count2=63;flag=1;}
			else if(count2==50){count2=69;flag=1;}
			else if(count2==62){count2=81;flag=1;}
			else if(count2==74){count2=92;flag=1;}
	
	
			if(flag==1){
				k=1;
				px2=210;
				py2=645;
				count_2=0;	
			M:
			for(int i=1;i<=10;i++){
				
				if(k==11){
					px2-=70;
					k--;
				}
				else if(k==0){
					px2+=70;
					k++;
				}
				for(int j=1;j<=10;j++){
					count_2++;
									
					try{Thread.sleep(50);}
					catch(Exception ex){}
	
					repaint();
					if(count==100||count2==100){//3
						gameover=true;
						tx1.setText("Game Over");
					}//3

					tx1.setText(tx2.getText()+" chance");
					if(count_2==count2)break M;
					if(i%2==1){
					px2+=70;
					k++;}
					else{
						px2-=70;
						k--;
	
					}
				}py2-=70;
			}
			}

			}//closing else

		}

		}//closing gameover

	}//closing gamestart
	else{
		new message();
	}

	}
}//class

class SnakeLadder
{
	public static void main (String ar[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		//f.setBounds(x,y,w,h);
        f.setBounds(100,0,990,735);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);		
	}
	
}
