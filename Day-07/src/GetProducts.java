import products.Ball;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;


public static void main(String[] args) {
    Ball ball =
            new Ball(new Random().nextLong(1000), UUID.randomUUID(), "Basketball", LocalDateTime.now(), 23.4, 30d);
    System.out.println(ball);
    Ball[] ball1 = new Ball[2];
    ball1[0] = new Ball(new Random().nextLong(2000),UUID.randomUUID(),"Basketball",LocalDateTime.now(),34.50,45.90);
    ball1[1] = new Ball(new Random().nextLong(2000),UUID.randomUUID(),"BassBall",LocalDateTime.now(),34d,45d);
    System.out.println(Arrays.toString(ball1));

    Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
    String[] columNames = {"ID","UUID","BallType","publishDate","price","discountAmount"};
    for(int i=0;i<columNames.length;i++){
        table.addCell(columNames[i], new CellStyle(CellStyle.HorizontalAlign.center));
        table.setColumnWidth(i,20,30);

    }

    for(Ball item : ball1){
        table.addCell(item.id.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(item.uuid.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(item.ballType, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(item.publishDate.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(item.price.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(item.discountAmount.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
    }
    System.out.println(table.render());
    Arrays.stream(ball1).forEach(e -> System.out.println("This is a item of array : " + e));

//    System.out.print("Input Type of Product : ");
//    ball.ballType = new Scanner(System.in).nextLine();
//
//    System.out.print("Input Price : ");
//    ball.price = new Scanner(System.in).nextDouble();


    System.out.printf("You buy %s and it cost $%f", ball.ballType, ball.price);

}
