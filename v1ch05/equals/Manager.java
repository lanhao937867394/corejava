package equals;

public class Manager extends Employee
{
   private double bonus;

   public Manager(String name, double salary, int year, int month, int day)
   {
      super(name, salary, year, month, day);
      bonus = 0;
   }

   public double getSalary()
   {
      double baseSalary = super.getSalary();
      return baseSalary + bonus;
   }

   public void setBonus(double bonus)
   {
      this.bonus = bonus;
   }

   public boolean equals(Object otherObject)
   {
      if (!super.equals(otherObject)) return false;
      var other = (Manager) otherObject;
      // super.equals checked that this and other belong to the same class
      /*
      Since we have check for identity, nullity, and class in the 
      overridden methods, we don't need to do them again; just call
      super.equals
      */
      return bonus == other.bonus;
   }

   public int hashCode()
   {
      /*
      call super.hashCode() to ensure that parent's fields are
      also considered when hashing the object.
      */
      return java.util.Objects.hash(super.hashCode(), bonus);
   }

   public String toString()
   {

      // When dealing with inheritance, always carefully consider whether
      // you should use a super method.
      return super.toString() + "[bonus=" + bonus + "]";
   }
}

