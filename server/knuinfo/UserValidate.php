<?php
require "DataBase.php";
$db = new DataBase();
 $con = mysqli_connect("localhost", "root", "", "knuinfo");
    mysqli_query($con,'SET NAMES utf8');
$userID = $_POST["userID"];
   
    $statement = mysqli_prepare($con, "SELECT username FROM users WHERE username = ?");
    mysqli_stmt_bind_param($statement, "s", $userID);
    mysqli_stmt_execute($statement);
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID);


    $response = array();
    $response["success"] = true;
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"]=false;
        $response["userID"]=$userID;
    }
   
    echo json_encode($response);

?>
