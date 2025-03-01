public class FamilyFood {

    public static void main(String[] args) {
        Family family1 = new NonVegFamily();
        family1.familyType();
        family1.orderVeg();
        if (family1 instanceof NonVegOrderFamily) {
            ((NonVegOrderFamily) family1).orderNonVeg();
        }

        Family family2 = new PureVegFamily();
        family2.familyType();
        family2.orderVeg(); 
    }
}

abstract class Family {
    abstract void familyType();
    abstract String getFamilyType();
    abstract void orderVeg(); 
}

abstract class NonVegOrderFamily extends Family {
    abstract void orderNonVeg();

    @Override
    public void orderVeg() {
        System.out.println("Ordering vegetarian food.");
    }
}

abstract class PureVegOrderFamily extends Family {
    @Override
    public void orderVeg() {
        System.out.println("Ordering vegetarian food.");
    }
}

class NonVegFamily extends NonVegOrderFamily {
    @Override
    public void familyType() {
        System.out.println("This is a Non-Vegetarian Family.");
    }

    @Override
    public String getFamilyType() {
        return "Non-Vegetarian Family";
    }

    @Override
    public void orderNonVeg() {
        System.out.println("Ordering meat for Non-Vegetarian Family.");
    }
}

class PureVegFamily extends PureVegOrderFamily {
    @Override
    public void familyType() {
        System.out.println("This is a Pure Vegetarian Family.");
    }

    @Override
    public String getFamilyType() {
        return "Pure Vegetarian Family";
    }
}
