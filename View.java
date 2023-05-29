public class View {
    public void run(){
        Controller controller = new Controller();
        Model model = new Model();
        controller.getData();
        model.operation(controller);
    }

    public void complexRun(){
        ComplexController complexController = new ComplexController();
        Adapter adapter = new Adapter();
        complexController.getData();
        adapter.operation(complexController);
    }
}
