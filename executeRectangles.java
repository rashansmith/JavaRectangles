/********************************/
/***** Name: Rashan Smith *******/
/********************************/

package apprendaCodingChallenge;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;


public class executeRectangles {
	public static void main(String[] args) {
		//Point R1 = new Point(1,1);
		//Point R4 = new Point(10, 6);
		//Point S1 = new Point(8, 3);
		//Point S4 = new Point(14, 5);
		
		//rectangles one = new rectangles(R1, R4);
		//rectangles two = new rectangles(S1, S4);
		
		//one.intersect(two);
		//one.adjacent(two);
		//one.containment(two);
		
		//create new frame
		JFrame frame = new JFrame("FrameDemo");
		// when the frame closes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Welcome Message
		JOptionPane.showMessageDialog(frame, "Welcome to Rashan's Coding Challenge. \nThis program tests whether "
				+ "2 rectangles are intersecting, adjacent, or contained ",
				 null, JOptionPane.INFORMATION_MESSAGE);
		
		//Obtaining input for first rectangle
		String topLeft1 = JOptionPane.showInputDialog("Please input a top left coordinate value for rectangle 1 (eg. x,y) ");
		if(!topLeft1.contains(",")){
			 topLeft1 = JOptionPane.showInputDialog("You forgot a comma. \nPlease input a top left coordinate value for rectangle 1 (eg. x,y ");
		}
		String[] points = topLeft1.split(",");
		int point1 = Integer.parseInt(points[0]);
		int point2 = Integer.parseInt(points[1]);
		Point T1 = new Point(point1, point2);
		
		String bottomRight1 = JOptionPane.showInputDialog("Please input a bottom right coordinate value for rectangle 1 (eg. x,y) ");
		if(!bottomRight1.contains(",")){
			 topLeft1 = JOptionPane.showInputDialog("You forgot a comma. \nPlease input a bottom right coordinate value for rectangle 1 (eg. x,y ");
		}
		String[] points2 = bottomRight1.split(",");
		int point11 = Integer.parseInt(points2[0]);
		int point22 = Integer.parseInt(points2[1]);
		Point T2 = new Point(point11, point22);
		
		rectangles first = new rectangles(T1, T2);
		
		
		//Obtaining input for second rectangle
		String topLeft2 = JOptionPane.showInputDialog("Please input a top left coordinate value for rectangle 2 (eg. x,y) ");
		if(!topLeft2.contains(",")){
			 topLeft2 = JOptionPane.showInputDialog("You forgot a comma. \nPlease input a top left coordinate value for rectangle 2 (eg. x,y ");
		}
		String[] pointss = topLeft2.split(",");
		int point111 = Integer.parseInt(pointss[0]);
		int point222 = Integer.parseInt(pointss[1]);
		Point T3 = new Point(point111, point222);
		
		String bottomRight2 = JOptionPane.showInputDialog("Please input a bottom right coordinate value for rectangle 2 (eg. x,y) ");
		if(!bottomRight2.contains(",")){
			 topLeft2 = JOptionPane.showInputDialog("You forgot a comma. \nPlease input a bottom right coordinate value for rectangle 2 (eg. x,y ");
		}
		String[] pointsss = bottomRight2.split(",");
		int point1111 = Integer.parseInt(pointsss[0]);
		int point2222 = Integer.parseInt(pointsss[1]);
		Point T4 = new Point(point1111, point2222);
		
		rectangles second = new rectangles(T3, T4);
		
	
		// drawing rectangles
		@SuppressWarnings("serial")
		class MyCanvas extends JComponent {

		  public void paint(Graphics g) {
			g.setColor(Color.RED);
		    g.drawRect(point1, point2, ((point11 - point1)* 20), ((point22 - point2)*20));
		    g.setColor(Color.GREEN);
		    g.drawRect(point111, point222, ((point1111 - point111)*20), (point2222 - point222)*20);
		  }
		}
		    JFrame window = new JFrame();
		    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    window.setBounds(30, 30, 300, 300);
		    window.getContentPane().add(new MyCanvas());
		    window.setVisible(true);
		  
		
		// Calculating the results
		String resultIntersect = "";
		String resultAdjacent = "";
		String resultContain = "";
		
		if(first.intersect(second)) {
			resultIntersect = "The rectangles intersect each other";
			}
		else{
			resultIntersect = "The rectangles do not intersect each other";
		}
		
		if(first.adjacent(second)) {
			resultAdjacent = "Rectangle 2 is adjacent to rectangle 1";
			}
		else{
			resultAdjacent = "Rectangle 2 is not adjacent to rectangle 1";
		}
		

		if(first.containment(second)) {
			resultContain = "Rectangle 1 contains rectangle 2";
			}
		else{
			resultContain = "Rectangle 1 does not conatin rectangle 2";
		}
		
		String results = resultIntersect + "\n" + resultAdjacent + "\n" + resultContain;
		
		JOptionPane.showMessageDialog(frame, "These are the results: \n"
				+ results,
				 null, JOptionPane.INFORMATION_MESSAGE);
}
}
