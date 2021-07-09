function calculate()
{
    var num1 = parseInt(document.getElementById('num1').value);
    var num2 = parseInt(document.getElementById("num2").value);

    console.log(typeof(num1));
    console.log(typeof(num2));

    var result = num1 + num2;

    document.getElementById('resultsDiv').innerHTML = "Addtion of two numbers : "+result;
    //alert(result);
    //document.write('This is from document write: '+result);
    return false;

}