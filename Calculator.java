import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;





class Calculator extends WindowAdapter implements ActionListener
{
	Frame f;
	TextField t1,t1_,t2,t2_;
	Label l;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	String result=new String("");
	Calculator()
	{
		f=new Frame("Simple Calculator Application");
		l=new Label("Press enter button to get your Output :)");
		l.setBounds(20,30,500,40);
		f.add(l);
		f.setSize(1000,4000);
		f.setLayout(null);
		f.setVisible(true);
		t1_=new TextField("Enter your expression here:");
		t1_.setBounds(20,100,180,20);t1_.setEditable(false);
		f.add(t1_);
		t1=new TextField();
		t1.setBounds(20,120,4000,20);
		f.add(t1);
		t2_=new TextField("Result:");
		t2_.setBounds(20,160,50,20);t2_.setEditable(false);
		f.add(t2_);
		t2=new TextField();
		t2.setBounds(20,180,4000,20);t2.setEditable(false);
		f.add(t2);
		b16=new Button("Delete");
		b16.setBounds(20,220,50,50);
		f.add(b16);
		b16.addActionListener(this);
		b15=new Button("/");
		b15.setBounds(90,220,50,50);
		f.add(b15);
		b15.addActionListener(this);
		b14=new Button("*");
		b14.setBounds(160,220,50,50);
		f.add(b14);
		b14.addActionListener(this);
		b13=new Button("-");
		b13.setBounds(230,220,50,50);
		f.add(b13);
		b13.addActionListener(this);
		b7=new Button("7");
		b7.setBounds(20,290,50,50);
		f.add(b7);
		b7.addActionListener(this);
		b8=new Button("8");
		b8.setBounds(90,290,50,50);
		f.add(b8);
		b8.addActionListener(this);
		b9=new Button("9");
		b9.setBounds(160,290,50,50);
		f.add(b9);
		b9.addActionListener(this);
		b11=new Button("+");
		b11.setBounds(230,290,50,120);
		f.add(b11);
		b11.addActionListener(this);
		b4=new Button("4");
		b4.setBounds(20,360,50,50);
		f.add(b4);
		b4.addActionListener(this);
		b5=new Button("5");
		b5.setBounds(90,360,50,50);
		f.add(b5);
		b5.addActionListener(this);
		b6=new Button("6");
		b6.setBounds(160,360,50,50);
		f.add(b6);
		b6.addActionListener(this);
		b1=new Button("1");
		b1.setBounds(20,430,50,50);
		f.add(b1);
		b1.addActionListener(this);
		b2=new Button("2");
		b2.setBounds(90,430,50,50);
		f.add(b2);
		b2.addActionListener(this);
		b3=new Button("3");
		b3.setBounds(160,430,50,50);
		f.add(b3);
		b3.addActionListener(this);
		b12=new Button("Enter");
		b12.setBounds(230,430,50,120);
		f.add(b12);
		b12.addActionListener(this);
		b0=new Button("0");
		b0.setBounds(20,500,120,50);
		f.add(b0);
		b0.addActionListener(this);
		b10=new Button(".");
		b10.setBounds(160,500,50,50);
		f.add(b10);
		b10.addActionListener(this);
		b17=new Button("Clear All");
		b17.setBounds(20,570,260,50);
		f.add(b17);
		b17.addActionListener(this);
		f.addWindowListener(this);  	
	}
	public void actionPerformed(ActionEvent e)
	{
		try{
				
					if (e.getSource()==b0)
					{ 
						result=result+'0';
						t1.setText(result);
					}
					else if (e.getSource()==b1)
					{ 
						result=result+'1';
						t1.setText(result);
					}
					else if (e.getSource()==b2)
					{
						result=result+'2';
						t1.setText(result);
					}
					else if (e.getSource()==b3)
					{
						result=result+'3';
						t1.setText(result);
					}
					else if (e.getSource()==b4)
					{ 
						result=result+'4';
						t1.setText(result);
					}
					else if (e.getSource()==b5)
					{
						result=result+'5';
						t1.setText(result);
					}
					else if (e.getSource()==b6)
					{
						result=result+'6';
						t1.setText(result);
					}
					else if (e.getSource()==b7)
					{
						result=result+'7';
						t1.setText(result);
					}
					else if (e.getSource()==b8)
					{
						result=result+'8';
						t1.setText(result);
					}
					else if (e.getSource()==b9)
					{
						result=result+'9';
						t1.setText(result);
					}
					else if (e.getSource()==b10)
					{
						result=result+'.';
						t1.setText(result);					
					}
					else if (e.getSource()==b11)
					{
						result=result+'+';
						t1.setText(result);
					}
					else if (e.getSource()==b12)
					{
						result=t1.getText();
						ScriptEngineManager mgr = new ScriptEngineManager();
						ScriptEngine engine = mgr.getEngineByName("JavaScript");
    					t2.setText(String.valueOf(engine.eval(result)));
					}
					else if (e.getSource()==b13)
					{
						result=result+'-';
						t1.setText(result);
					}
					else if (e.getSource()==b14)
					{
						result=result+'*';
						t1.setText(result);
					}
					else if (e.getSource()==b15)
					{
						result=result+'/';
						t1.setText(result);
					}
					else if (e.getSource()==b16)
					{
						result=result.substring(0,result.length()-1);
						t1.setText(result);
					}
					else if (e.getSource()==b17)
					{
						result="";
						t1.setText("");
						t2.setText("");
					}	

		}
		catch(Exception z)
		{

		}
	}
	public void windowClosing(WindowEvent e) 
	{  
    	f.dispose();  
	}  
	public static void main(String[] args) 
	{
		new Calculator();
	}
}