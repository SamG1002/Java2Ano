import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class calc extends JFrame {

	private JPanel container;
	private JLabel lbAnswer;
	private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSum, btnSub, btnMult, btnDiv, btnEqual, btnClean;

	private boolean firstN = true, nextCalc = false;
	private double firstValue = 0, secondValue = 0, n2, res = 0;
	private int value = 0, i = 0, j = 0;
	private String operation = null;
	
	public calc() {
		screen();
		initializeComponents();
		defineEvents();
	}

	private void screen() {
		container = new JPanel();
		container.setLayout(null);
		container.setBackground(Color.darkGray);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora dos irmãos");
		setBounds(0, 0, 411, 297);
		setLocationRelativeTo(null);
		setContentPane(container);
	}

	private void initializeComponents() {
				
		lbAnswer = new JLabel("Answer");
		btn0 = new JButton("0"); btn1 = new JButton("1");
		btn2 = new JButton("2"); btn3 = new JButton("3");
		btn4 = new JButton("4"); btn5 = new JButton("5");
		btn6 = new JButton("6"); btn7 = new JButton("7");
		btn8 = new JButton("8"); btn9 = new JButton("9");
		btnSum = new JButton("+"); btnSub = new JButton("-");
		btnMult = new JButton("x"); btnDiv = new JButton("/");
		btnClean = new JButton("C"); btnEqual = new JButton("=");
		
		
		// Output
		
		lbAnswer.setBounds(3, 3, 389, 40);
		lbAnswer.setBorder(BorderFactory.createLineBorder(new Color(37, 38, 36), 2));
		Border border = lbAnswer.getBorder();
		Border margin = new EmptyBorder(10, 10, 10, 100);
		lbAnswer.setBorder(new CompoundBorder(border, margin));
		lbAnswer.setForeground(Color.white);

		// Buttons
		
		btn7.setBounds(3, 46, 95, 50); btn8.setBounds(101, 46, 95, 50);
		btn9.setBounds(199, 46, 95, 50); btnSum.setBounds(297, 46, 95, 50);
		
		btn4.setBounds(3, 99, 95, 50); btn5.setBounds(101, 99, 95, 50);
		btn6.setBounds(199, 99, 95, 50); btnSub.setBounds(297, 99, 95, 50);
		
		btn1.setBounds(3, 152, 95, 50); btn2.setBounds(101, 152, 95, 50);
		btn3.setBounds(199, 152, 95, 50); btnMult.setBounds(297, 152, 95, 50);
		
		btnClean.setBounds(3, 205, 95, 50); btn0.setBounds(101, 205, 95, 50);
		btnEqual.setBounds(199, 205, 95, 50); btnDiv.setBounds(297, 205, 95, 50);
		
		onButtons(btn0); onButtons(btn1);
		onButtons(btn2); onButtons(btn3);
		onButtons(btn4); onButtons(btn5);
		onButtons(btn6); onButtons(btn7);
		onButtons(btn8); onButtons(btn9);
		onButtons(btnSum); onButtons(btnSub);
		onButtons(btnMult); onButtons(btnDiv);
		onButtons(btnClean); onButtons(btnEqual);
				
		add(lbAnswer);
		add(btn0); add(btn1);
		add(btn2); add(btn3);
		add(btn4); add(btn5);
		add(btn6); add(btn7);
		add(btn8); add(btn9);
		add(btnSum); add(btnSub);
		add(btnMult); add(btnDiv);
		add(btnClean); add(btnEqual);
	}

	private void defineEvents() {
		
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn0();
			}	
		});
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1();
			}	
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn2();
			}	
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn3();
			}	
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn4();
			}	
		});
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn5();
			}	
		});
		
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn6();
			}	
		});
		
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn7();
			}	
		});
		
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn8();
			}	
		});
		
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn9();
			}	
		});
		
		btnSum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				opAddition();
			}	
		});
		
		btnSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				opSubtraction();
			}	
		});
		
		btnMult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				opMultiplication();
			}	
		});
		
		btnDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				opDivision();
			}	
		});
		
		btnClean.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbAnswer.setText("");
				cleaner();
			}			
		});
	
		btnEqual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				equal();
			}		
		});
	}
	
	private void btn0() {
		this.nextCalc = false;
		this.value = 0;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn1() {
		this.nextCalc = false;
		this.value = 1;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn2() {
		this.nextCalc = false;
		this.value = 2;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn3() {
		this.nextCalc = false;
		this.value = 3;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn4() {
		this.nextCalc = false;
		this.value = 4;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn5() {
		this.nextCalc = false;
		this.value = 5;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}

	private void btn6() {
		this.nextCalc = false;
		this.value = 6;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn7() {
		this.nextCalc = false;
		this.value = 7;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn8() {
		this.nextCalc = false;
		this.value = 8;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
	
	private void btn9() {
		this.nextCalc = false;
		this.value = 9;
        calcNumbers();
        presentation();
        if(firstN) i++;
        else j++;
	}
		
	private void opAddition() {
        if(this.nextCalc) {
        	this.firstValue = res;
        	this.firstN = false;
        	setOperation("+");
        }
        else setOperation("+");

	}
	
	private void opSubtraction() {
        if(this.nextCalc) {
        	this.firstValue = res;
        	this.firstN = false;
        	setOperation("-");
        }
        else setOperation("-");

	}
	
	private void opMultiplication() {
        if(this.nextCalc) {
        	this.firstValue = res;
        	this.firstN = false;
        	setOperation("*");
        }
        else setOperation("*");

	}
	
	private void opDivision() {
        if(this.nextCalc) {
        	this.firstValue = res;
        	this.firstN = false;
        	setOperation("/");
        }
        else setOperation("/");

	}
	
	private void equal() {
		double res = 0;
        if(!firstN && !operation.equals("vazio")){
            switch(operation) {
                case "+":
                	res = firstValue + secondValue;
                    break;
                case "-":
                	res = firstValue - secondValue;
                    break;
                case "*":
                	res = firstValue * secondValue;
                    break;
                case "/":
                	res = firstValue / secondValue;
                    break;
            }
            this.res = res;
            if(res % 1 == 0) {
                String resultadoInteiro = String.format("%.0f", res);
                lbAnswer.setText(resultadoInteiro);
            }
            else lbAnswer.setText(Double.toString(res));

        }else JOptionPane.showMessageDialog(null, "Você precisa fazer alguma operação!");
        cleaner();
        this.nextCalc = true;
	}
	
	private double coupleNumbers(double n1, double n2) { return (n1 * 10) + n2; }
	
    public void calcNumbers(){
        if(this.firstN){
            if(i == 0) firstValue = this.value;
            else if(i != 0 && firstN) {
                n2 = this.value;
                this.firstValue = coupleNumbers(firstValue, n2);
                this.i = 0;
            }
        }else{
            if(j == 0) secondValue = this.value;
            else if(j != 0 && !firstN) {
                n2 = this.value;
                this.secondValue = coupleNumbers(secondValue, n2);
                this.j = 0;
            }
        }
    }
	
	private void cleaner() {
        this.firstValue = 0;
        this.secondValue = 0;
        this.operation = "vazio";
        this.firstN = true;
        this.i = 0;
        this.j = 0;
        this.nextCalc = false;
	}
	
	private void setOperation(String operation) {
		this.firstN = false;
		this.operation = operation;
		lbAnswer.setText(operation);
	}
	
	private void presentation() {
		String recentValues1 = String.format("%.0f", firstValue);
        String recentValues2 = String.format("%.0f", secondValue);
        if(firstN) lbAnswer.setText(recentValues1);
        else {
            j++;
            lbAnswer.setText(recentValues2);
        }
	}
	
	private void onButtons(JButton btn) {
		btn.setBackground(new Color(37, 38, 36));
		btn.setForeground(Color.white);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	        	btn.setBackground(new Color(44, 44, 44));
	        }

	        public void mouseExited(MouseEvent e) {
	    		btn.setBackground(new Color(38, 38, 38));
	        }
		});
	}
}