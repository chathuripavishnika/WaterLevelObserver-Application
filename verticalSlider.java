import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class verticalSlider extends JFrame{
	private JPanel p1,p2,btnPanel;
	private JSlider slider;
	
	private int alarmId=0;
	private int DisplayId=0;
	private int SMSsender=0;
	private int Splitter=0;
	
	
verticalSlider(){
	setSize(500,250);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	p1=new JPanel(new BorderLayout()); 
	p2=new JPanel(new GridBagLayout());
	
	p2.setPreferredSize(new Dimension(500,250));
	
	btnPanel = new JPanel();
	btnPanel.setLayout(new GridLayout(4,1,15,15));
	btnPanel.setPreferredSize(new Dimension(180,350));
			
			JButton b1 = new JButton("Alarm");
			JButton b2 = new JButton("Display");
			JButton b3 = new JButton("SMSsender");
			JButton b4 = new JButton("Splitter");
	
	
			b1.setPreferredSize(new Dimension(200,60));
			b2.setPreferredSize(new Dimension(200,60));
			b3.setPreferredSize(new Dimension(200,60));
			b4.setPreferredSize(new Dimension(200,60));
	
			btnPanel.add(b1);
			btnPanel.add(b2);
			btnPanel.add(b3);
			btnPanel.add(b4);
	
			GridBagConstraints gbc = new GridBagConstraints();
			gbc. gridx=0;
			gbc. gridy=0;
			gbc. anchor= GridBagConstraints.CENTER;
			
			p2.add(btnPanel,gbc);
			
			slider = new JSlider(JSlider.VERTICAL,0,100,0);
			slider.setPreferredSize(new Dimension(100, 600));
		
			p1.add(slider, BorderLayout.EAST);
			p1.add(p2, BorderLayout.CENTER);
		
			slider.setMajorTickSpacing(25);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
		
		
			add(p1 );	
		
			setVisible(true);
		
			Collection crc = new Collection();
		
		
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
				
					alarmId++;
				
					crc.addWaterLevelObserver(new Alarm("A00"+alarmId));
				
			    }
			});
		
			
			b2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
				
					DisplayId++;
				
					crc.addWaterLevelObserver(new Display("D00"+DisplayId));
				
				
				
			    }
			});
		
		
		
			b3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
				
					SMSsender++;
				
					crc.addWaterLevelObserver(new SMSsender("SM00"+SMSsender));
				
				}
			});
		
		
			b4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
				
					Splitter++;
				
					crc.addWaterLevelObserver(new Splitter("S00"+Splitter));
				
				}
			});
		
		
		
			slider.addChangeListener(e -> {
			int value = slider.getValue();
            crc.setWaterLevel(value);
            
            

            });
}
	
		
		
		
	
	
    
}
