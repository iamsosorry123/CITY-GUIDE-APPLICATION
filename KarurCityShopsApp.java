packageSSA;
importjavax.swing.*;
importjavax.swing.table.DefaultTableModel; 
import java.awt.*;
importjava.util.ArrayList; 
import java.util.List;
publicclassKarurCityShopsApp{
privatestaticList<Shop>shopList=newArrayList<>();
public static void main(String[] args) {
populateShopList(); 
mainLoginScreen();
}
privatestaticvoidpopulateShopList(){
// Adding 20 sample shops to the list, with open and close times 
shopList.add(newShop("SuperMart","Grocery","MainStreet","08:00AM",
"08:00PM"));
shopList.add(newShop("TechZone","Electronics","ParkAvenue","10:00 AM", 
"06:00 PM"));
shopList.add(newShop("CoffeeCorner","Cafe","Downtown","07:00AM", "07:00 
PM"));
shopList.add(newShop("GlamourBoutique","Clothing","HighwayRoad", 
"09:00 AM", "09:00 PM"));
shopList.add(newShop("ToyWorld","Toys","SunsetBoulevard","10:00 AM", 
"08:00 PM"));
shopList.add(newShop("BookNook","Books","RiverRoad","10:00AM", "07:00 
PM"));
shopList.add(newShop("MusicMania","Music","ElmStreet","09:00AM", "06:00 
PM"));
shopList.add(newShop("GreenGrocer","Grocery","BakerStreet","08:00 AM", 
"08:00 PM"));
shopList.add(newShop("FastFashion","Clothing","SecondStreet","10:00 AM", 
"09:00 PM"));
shopList.add(newShop("TechHub","Electronics","CedarLane","09:30AM", 
"06:30 PM"));
shopList.add(newShop("SweetTreats","Bakery","MapleAvenue","06:00 AM", 
"06:00 PM"));
shopList.add(newShop("FreshHarvest","Grocery","CherryRoad","08:00 AM", 
"08:00 PM"));
shopList.add(newShop("HomeEssentials","HomeDecor","PineStreet", "10:00 
AM", "07:00 PM"));
shopList.add(newShop("GadgetShop","Electronics","OakDrive","10:00 AM", 
"07:00 PM"));
shopList.add(newShop("ToyKingdom","Toys","LakesideAvenue","10:00 AM", 
"08:00 PM"));
shopList.add(newShop("TheBookstore","Books","WestEnd","09:00AM", "06:00 
PM"));
shopList.add(newShop("StyleStreet","Clothing","NorthPark","09:30AM", "09:30 
PM"));
shopList.add(newShop("CycleWorld","Sports","MainSquare","08:00AM", "06:00 
PM"));
shopList.add(newShop("BeautyBoutique","Beauty","OceanRoad","10:00 
AM", "08:00 PM"));
shopList.add(newShop("CafeDelight","Cafe","HilltopRoad","07:00AM", "07:00 
PM"));
}
privatestaticvoidmainLoginScreen(){
JFrame mainLoginFrame = new JFrame("Karur City Shops - Login"); 
mainLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
mainLoginFrame.setSize(400, 300);
mainLoginFrame.setLayout(newGridLayout(3,1));
JButtonadminButton=newJButton("AdminLogin"); 
JButton userButton = new JButton("User Login");
// Add action listeners for each button 
adminButton.addActionListener(e->showAdminLogin()); 
userButton.addActionListener(e -> showUserLogin());
// Add buttons to the main frame 
mainLoginFrame.add(adminButton); 
mainLoginFrame.add(userButton);
mainLoginFrame.setVisible(true);
}
privatestaticvoidshowAdminLogin(){
JFrameadminLoginFrame=newJFrame("AdminLogin");
adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
adminLoginFrame.setSize(300, 200);
adminLoginFrame.setLayout(newGridLayout(3,2));
JLabelusernameLabel=newJLabel("Username:"); 
JTextField usernameField = new JTextField();
JLabel passwordLabel = new JLabel("Password:"); 
JPasswordFieldpasswordField=newJPasswordField();
JButtonloginButton=newJButton("Login");
adminLoginFrame.add(usernameLabel); 
adminLoginFrame.add(usernameField); 
adminLoginFrame.add(passwordLabel); 
adminLoginFrame.add(passwordField); 
adminLoginFrame.add(new JLabel()); 
adminLoginFrame.add(loginButton);
loginButton.addActionListener(e->{
Stringusername=usernameField.getText();
Stringpassword=newString(passwordField.getPassword());
if(username.equals("admin")&&password.equals("admin123")){ 
adminLoginFrame.dispose();
adminDashboard();
}else {
JOptionPane.showMessageDialog(adminLoginFrame,"Invalid 
credentials.", "Error", JOptionPane.ERROR_MESSAGE);
}
});
adminLoginFrame.setVisible(true);
}
privatestaticvoidshowUserLogin(){
JFrame userLoginFrame = new JFrame("User Login"); 
userLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
userLoginFrame.setSize(300, 200);
userLoginFrame.setLayout(newGridLayout(3,2));
JLabelusernameLabel=newJLabel("Username:"); 
JTextField usernameField = new JTextField();
JLabel passwordLabel = new JLabel("Password:"); 
JPasswordFieldpasswordField=newJPasswordField();
JButtonloginButton=newJButton("Login");
userLoginFrame.add(usernameLabel); 
userLoginFrame.add(usernameField); 
userLoginFrame.add(passwordLabel); 
userLoginFrame.add(passwordField); 
userLoginFrame.add(new JLabel()); 
userLoginFrame.add(loginButton);
loginButton.addActionListener(e->{
Stringusername=usernameField.getText();
String password = new 
String(passwordField.getPassword());if(username.equals("user
")&&password.equals("user123")){
userLoginFrame.dispose(); 
userDashboard();
}else {
JOptionPane.showMessageDialog(userLoginFrame,"Invalidcredentials.", 
"Error", JOptionPane.ERROR_MESSAGE);
}
});
userLoginFrame.setVisible(true);
}
privatestaticvoidadminDashboard(){
JFrame adminFrame = new JFrame("Admin Dashboard"); 
adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
adminFrame.setSize(400, 350);
adminFrame.setLayout(newGridLayout(6,2));
JLabelnameLabel=newJLabel("ShopName:"); JTextField 
nameField = new JTextField();
JLabeltypeLabel=newJLabel("ShopType:"); JTextField 
typeField = new JTextField();
JLabellocationLabel=newJLabel("Location:"); 
JTextField locationField = new JTextField();
JLabelopenLabel=newJLabel("OpenTime:"); JTextField 
openField = new JTextField();
JLabelcloseLabel=newJLabel("CloseTime:"); JTextField 
closeField = new JTextField();
JButtonaddButton=newJButton("AddShop");
adminFrame.add(nameLabel); 
adminFrame.add(nameField); 
adminFrame.add(typeLabel); 
adminFrame.add(typeField); 
adminFrame.add(locationLabel); 
adminFrame.add(locationField); 
adminFrame.add(openLabel); 
adminFrame.add(openField); 
adminFrame.add(closeLabel); 
adminFrame.add(closeField); 
adminFrame.add(new JLabel()); 
adminFrame.add(addButton);
addButton.addActionListener(e -> { 
Stringname=nameField.getText(); 
String type = typeField.getText();
Stringlocation=locationField.getText(); 
String openTime = openField.getText(); 
String closeTime = closeField.getText();
if(name.isEmpty()||type.isEmpty()||location.isEmpty()|| openTime.isEmpty() 
|| closeTime.isEmpty()) {
JOptionPane.showMessageDialog(adminFrame,"Allfieldsarerequired.", 
"Error", JOptionPane.ERROR_MESSAGE);
}else {
//Addthenewshoptothesharedshoplist
shopList.add(newShop(name,type,location,openTime,closeTime));
JOptionPane.showMessageDialog(adminFrame,"Shopadded 
successfully.");
nameField.setText(""); 
typeField.setText(""); 
locationField.setText(""); 
openField.setText("");
closeField.setText("");
}
});
adminFrame.setVisible(true);
}
privatestaticvoiduserDashboard(){
JFrame userFrame = new JFrame("Karur City Shops"); 
userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
userFrame.setSize(600, 500);
// Set a simple background color 
userFrame.getContentPane().setBackground(Color.CYAN);
//Createatabletodisplaytheshops'information JTable 
shopsTable = new JTable();
DefaultTableModelmodel=newDefaultTableModel(newString[]{"Name", "Type", 
"Location", "Open Time", "Close Time", "Rating"}, 0);
shopsTable.setModel(model);
//Addrowsfromtheshoplisttothetable for 
(Shop shop : shopList) {
model.addRow(newObject[]{ 
shop.getName(), 
shop.getType(), 
shop.getLocation(), 
shop.getOpenTime(), 
shop.getCloseTime(),
shop.getRating()==0?"NotRated":shop.getRating()//Display"Not Rated" if 
no rating
});
}
// Add a listener for row selection 
shopsTable.getSelectionModel().addListSelectionListener(e->{
intselectedRow=shopsTable.getSelectedRow(); 
if (selectedRow != -1) {
StringshopName=(String)shopsTable.getValueAt(selectedRow,0); Shop 
selectedShop = getShopByName(shopName);
if(selectedShop!=null){
StringnewRating=JOptionPane.showInputDialog(userFrame,"Enter
Ratingfor"+shopName+"(1-5):");
try{
intrating=Integer.parseInt(newRating); if 
(rating >= 1 && rating <= 5) {
selectedShop.setRating(rating); // Set the rating for the shop 
model.setValueAt(rating,selectedRow,5);//Updatetheratingin
thetable
}else {
JOptionPane.showMessageDialog(userFrame,"Pleaseenterarating
between1and5.","InvalidRating",JOptionPane.ERROR_MESSAGE);
}
}catch(NumberFormatExceptionex){
JOptionPane.showMessageDialog(userFrame,"Pleaseenteravalid 
number for the rating.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
}
}
}
});
// Add the table to a scroll pane so it can be scrollable 
JScrollPanescrollPane=newJScrollPane(shopsTable); 
userFrame.add(scrollPane);
userFrame.setVisible(true);
}
privatestaticShopgetShopByName(Stringname){ for 
(Shop shop : shopList) {
if(shop.getName().equals(name)){ 
return shop;
}
}
returnnull;
}
static class Shop {private 
String name; private 
String type; 
privateStringlocation;
private String openTime; 
privateStringcloseTime;
privateintrating;//Ratingoutof5
publicShop(Stringname,Stringtype,Stringlocation,StringopenTime,String 
closeTime) {
this.name = name; 
this.type = type; 
this.location=location;
this.openTime = openTime; 
this.closeTime = closeTime; 
this.rating=0;//Defaultratingto0
}
publicStringgetName(){ 
return name;
}
publicStringgetType(){ 
return type;
}
publicStringgetLocation(){ return 
location;
}
publicStringgetOpenTime(){ 
return openTime;
}
publicStringgetCloseTime(){ 
return closeTime;
}
publicintgetRating(){ 
return rating;
}
publicvoidsetRating(intrating){ this.rating 
= rating;
}
}
}