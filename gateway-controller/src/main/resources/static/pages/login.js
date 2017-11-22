var theUrl='/gateway-controller/command';
var httpPost='post';
var theContentType='application/json;charset=utf-8';
function send(serviceType, data){
    var json = {
        serviceType: serviceType,
        data: data
    };
    console.log("发送:", json.serviceType, "--", JSON.stringify(data));
    $.ajax({
        type:httpPost,
        url:theUrl,
        contentType:theContentType,
        data:JSON.stringify(json),
        success:function(data){
            alert(data.resultCode);
            console.log("接收:", data.serviceType, "--", data.resultCode, "--", JSON.stringify(data));
        }
    });
}
function login(){
    send("login", {
        phone: "18302483421"
    });
}