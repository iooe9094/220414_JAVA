package ex04;

public class ShapeTest {
	
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
			
		Shape shape = new Shape(); // 모양 (부모)
		Line line = new Line(); // 선, shape를 상속받게 설계
	    Rect rect = new Rect(); // 사각형, shape를 상속받게 설계
	    Circle circle = new Circle(); // 원, shape를 상속받게 설계
	    
//	    shape.draw(); // 출력 : Shape
//	    // 부모인 Shape의 draw()가 아닌 자식인 line, rect, circle의 draw()가 출력
//	    line.draw(); // Line
//	    rect.draw(); // Rect
//	    circle.draw(); // Circle
	    
	    paint(shape);
	    paint(rect);
	    paint(line);
	    paint(circle);
	}
	
}
