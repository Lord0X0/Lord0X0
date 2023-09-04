import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class klockagain extends JFrame {

    Calendar Calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    klockagain(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(true);

        timeFormat = new SimpleDateFormat( "hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat ("MMMMM dd, yyyy");

        timeLabel = new JLabel();

        time = timeFormat.format(Calendar.getInstance().getTime());

        timeLabel.setText(time);
       timeLabel.setFont(new Font("verdana",Font.PLAIN,50));
       timeLabel.setForeground(new Color(0x00FF00));
       timeLabel.setBackground(Color.black);
       timeLabel.setOpaque(true);

       dayLabel = new JLabel();
       dayLabel.setFont(new Font("Verdana",Font.PLAIN,50));

       dateLabel = new JLabel();
       dateLabel.setFont(new Font("Verdana",Font.PLAIN,50));
       
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();}
    
        public void setTime() {
            while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
    
            day = dayFormat.format(Calendar.getInstance().getFirstDayOfWeek());
            dayLabel.setText(day);
    
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
    
                try{
            Thread.sleep(1000);
            } catch (InterruptedException e) {
    
                e.printStackTrace();
            }
        }

}
}

