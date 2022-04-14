/*
 * This is a fake database.
 * There is a advantage here, I don't need to set up a real SQL Server DB to start develop.
 * Just start with an on-memory DB is enough
 *
 */
public class BankAccountInMemoryDB implements BankAccountGateway {
 
    private static Map accountDB = new HashMap();
 
    static {
        {
            BankAccount account = new BankAccount();
            account.setId(1);
            account.setNumber("001");
            account.setBalance(BigDecimal.valueOf(100000));
            accountDB.put(1, account);
        }
        {
            BankAccount account = new BankAccount();
            account.setId(2);
            account.setNumber("002");
            account.setBalance(BigDecimal.valueOf(500000));
            accountDB.put(2, account);
        }
        {
            BankAccount account = new BankAccount();
            account.setId(3);
            account.setNumber("003");
            account.setBalance(BigDecimal.valueOf(700000));
            accountDB.put(3, account);
        }
    }
 
    @Override
    public void save(BankAccount entity) {
        System.out.println("Save BankAccount with number: " + entity.getNumber() + ", balance = " + entity.getBalance() + " to SQL DB");
        accountDB.put(entity.getId(), entity);
    }
 
    @Override
    public BankAccount getById(int id) {
        System.out.println("Find BankAccount by id: " + id);
        return accountDB.get(id);
    }
 
    @Override
    public BankAccount getByNumber(String number) {
        Iterator iterator = accountDB.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if(entry.getValue().getNumber().equals(number)) {
                return entry.getValue();
            }
        }
        return null;
    }
 
}