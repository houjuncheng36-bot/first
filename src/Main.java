import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        menu();
        int choice = 0;
        while(true){
            System.out.println("请输入选择：");
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();
            input.nextLine();
            switch (i) {
                case 1: {
                    manageBooks();
                    menu();
                    break;
                }
                case 2:borrowBooks();break;
                case 3:returnBooks();break;
                case 4:outputRanking();break;
                case 0: {
                    System.out.println("系统退出");
                    input.close();
                    System.exit(0);
                }
                default: {
                    System.out.println("输入有误，请重新选择");
                }
            }
        }
    }

    private static void menu() {
        System.out.println("===================================================");
        System.out.println("*****************1.管理图书(增删改查)******************");
        System.out.println("*****************2.借阅书籍        ******************");
        System.out.println("*****************3.归还书籍        ******************");
        System.out.println("*****************4.出量排行榜       ******************");
        System.out.println("*****************0.退出系统        ******************");
        System.out.println("===================================================");
    }

    static void manageBooks() throws NoSuchMethodException {
        System.out.println("======图书管理子菜单======");
        System.out.println("1.增加书籍       2.删除书籍");
        System.out.println("3.修改书籍       4.查询书籍");
        System.out.println("0.返回上一级              ");
        System.out.println("=======================");
        int choice = 0;
        outer:
        {
            while (true) {
                System.out.println("请输入选择：");
                Scanner input = new Scanner(System.in);
                int i = input.nextInt();
                input.nextLine();
                switch (i) {
                    case 1:
                        addBooks();
                        break;
                    case 2:
                        deleteBooks();
                        break;
                    case 3:
                        editBooks();
                        break;
                    case 4:
                        searchBooks();
                        break;
                    case 0:
                        break outer;
                    default: {
                        System.out.println("输入有误，请重新选择");
                    }
                }
            }
        }
    }
    static void borrowBooks(){
        System.out.println("选择你要借阅的书籍：");
    }
    static void returnBooks(){
        System.out.println("请输入你要归还书籍的编号：");
    }
    static void outputRanking(){
        System.out.println("排行榜如下：");
    }
    static void addBooks(){
        String[] str = new String[4];
        while (true) {
            System.out.println("请写入要添加的书籍：(按q退出添加)");
            Scanner input = new Scanner(System.in);
            if(input.next().equals("q")){
                input.close();
                break;
            }
            for(int i = 0; i < 4; i++){
                str[i] = input.next();
                input.nextLine();
            }
            Book book = new Book(str[0], str[1], Integer.parseInt(str[2]), Double.parseDouble(str[3]));
            System.out.println("添加 "+str[0]+" 成功");
        }
    }
    static void deleteBooks(){
        System.out.println("输入书籍的ID号：");
    }
    static void editBooks(){
        System.out.println("输入书籍的ID号：");
    }
    static void searchBooks(){
        System.out.println("目前的书籍如下：");
        System.out.println("目前的书籍如下：");
    }
}
