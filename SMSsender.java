import javax.swing.*;
import java.awt.*;

class SMSsender extends WaterLevelObserver{
	
	private String id;
    private JLabel lblSMSsender;
    

    private  JFrame frame;
    private JPanel panel;
	static int y=0;
	
    SMSsender(String id) {
        this.id = id;
			y=y+100;
      
        
            frame = new JFrame("SMSsender");
            frame.setSize(300, 150);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setLocation(750, y);
            frame.setVisible(true);
           
			
			
            panel = new JPanel(new GridLayout(0, 1, 5, 10));
            panel.setBackground(new Color(0, 255, 0));
            frame.add(panel);
			if(frame != frame){
				frame.setLocation(50, 100);
			}

        
        lblSMSsender= new JLabel(id + " --> SMSsender", JLabel.CENTER);
        lblSMSsender.setFont(new Font("", Font.BOLD, 20));

        panel.add(lblSMSsender);
		frame.setVisible(true);
		
		
		
		
		
       
    }

   
    public void update(int waterLevel) {
		
        if (waterLevel > 50) {
            lblSMSsender.setText(id + " --> Water Level Up");
        } else {
            lblSMSsender.setText(id + " --> Water Level Down");
        }
        
        
    }

    
    public String toString() {
        return id;
    }

	
	
	
	
	
}



