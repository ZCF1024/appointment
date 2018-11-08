function getTime(){
	var now = new Date();
    // now.getDay(); //获取星期X(0-6,0代表星期天)
	// now.getSeconds(); //获取秒数(0-59)
	var nowStr = now.getFullYear() + "-"; // 获取年份(4位)
	nowStr += addZero(now.getMonth() + 1) + "-"; // 获取月份(0-11)
	nowStr += addZero(now.getDate()) + " "; // 获取日(1-31)
	nowStr += addZero(now.getHours()) + ":"; // 获取小时数(0-23)
	nowStr += addZero(now.getMinutes()); // 获取分钟数(0-59)
	console.log(nowStr);
	return nowStr;
}

function getDate(){
	var now = new Date();
	var nowStr = now.getFullYear() + "-"; // 获取年份(4位)
	nowStr += addZero(now.getMonth()  + 1) + "-"; // 获取月份(0-11)
	nowStr += addZero(now.getDate()); // 获取日(1-31)
	console.log(nowStr);
	return nowStr;
}

function addZero(param){
	if(param / 10 < 1){
		return "0" + param;
	}
	return "" + param;
}

function getNumToNumAray(start, end){
	var aray = [];
	for(var i = start; i <= end; i++){
		aray.push(i);
	}
    return aray;
}

/** page create.html*/

$("#needed-password").click(function() {
    var self = $(this);
    if(self.prop("checked")){
        $("#password-container").show();
    } else{
        $("#password-container").hide();
    }
});

$("#submit").click(function() {
    var topic = $("#topic").val();
    var desc = $("#desc").val();
    var peoLimit = $("#peo-limit").val();
    var deadline = $("#deadline").val();
    var password = $("#password").val();
    if(topic == ""){
        $.toptip('主题不能为空', 'warning');
        return;
    }
    if($("#password-container").is(":visible") && password == ""){
        $.toptip('密码不能为空', 'warning');
        return;
    }

    if(peoLimit == ""){
        peoLimit = 10;
    }

    console.log("topic: " + topic + " desc: " + desc + " peo: " + peoLimit + " deadline: " + deadline + " password: " + password);
    $.toast('发起成功', 3000);
});

$("#desc").bind("input propertychange", function(){
    var length = $(this).val().length;
    if(length > 120){
        length--;
        $(this).val($(this).val().slice(0, length));
        return;
    }
    var sp = $(".weui-textarea-counter").children("span");
    sp.text(length);

})