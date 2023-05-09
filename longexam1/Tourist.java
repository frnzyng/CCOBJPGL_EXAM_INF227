interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Baguio baguio);
    void visit(Batanes batanes);
    void visit(Bohol bohol);
    void visit(Palawan palawan);
    void visit(Tagaytay tagaytay);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
