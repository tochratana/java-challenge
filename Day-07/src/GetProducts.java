import products.Ball;

public static void main(String[] args) {
    Ball ball =
            new Ball(new Random().nextLong(1000), UUID.randomUUID(), "Big", LocalDateTime.now(), 23.4, 30d);
    System.out.println(ball);

    System.out.print("Input Type of Product : ");
    ball.ballType = new Scanner(System.in).nextLine();

    System.out.print("Input Price : ");
    ball.price = new Scanner(System.in).nextDouble();

    System.out.printf("You buy %s and it cost %f", ball.ballType, ball.price);

}
