public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget-boracay.airFare >= 0) {
            System.out.println("I'm here at Boracay :)");
            budget = budget-boracay.airFare;
            checkBudget();
        }
        else {
            System.out.println("I can't go to Boracay. I need more money :(");
        }
    }

    public void visit(Baguio baguio) {
        if (budget-baguio.airFare >= 0) {
            System.out.println("I'm here at Baguio :)");
            budget = budget-baguio.airFare;
            checkBudget();
        }
        else {
            System.out.println("I can't go to Baguio. I need more money :(");
        }
    }

    public void visit(Batanes batanes) {
        if (budget-batanes.airFare >= 0) {
            System.out.println("I'm here at Batanes :)");
            budget = budget-batanes.airFare;
            checkBudget();
        }
        else {
            System.out.println("I can't go to Batanes. I need more money :(");
        }
    }

    public void visit(Bohol bohol) {
        if (budget-bohol.airFare >= 0) {
            System.out.println("I'm here at Bohol :)");
            budget = budget-bohol.airFare;
            checkBudget();
        }
        else {
            System.out.println("I can't go to Bohol. I need more money :(");
        }
    }

    public void visit(Palawan palawan) {
        if (budget-palawan.airFare >= 0) {
            System.out.println("I'm here at Palawan :)");
            budget = budget-palawan.airFare;
            checkBudget();
        }
        else {
            System.out.println("I can't go to Palawan. I need more money :(");
        }
    }

    public void visit(Tagaytay tagaytay) {
        if (budget-tagaytay.airFare >= 0) {
            System.out.println("I'm here at Tagaytay :)");
            budget = budget-tagaytay.airFare;
            checkBudget();
        }
        else {
            System.out.println("I can't go to Tagaytay. I need more money :(");
        }
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}