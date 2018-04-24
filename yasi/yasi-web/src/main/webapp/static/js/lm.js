/*var testMenu=[
    {"name": "印刷品",
      "submenu": [
            {"name": "样本","url": ""},
            {"name": "信封","url": ""}]
	},
	
    {"name": "展览品",
      "submenu": [
            {"name": "X展架","url": ""},
            {"name": "易拉宝",
              "submenu": [
                   {"name": "易拉宝1","url": ""},
				   {"name": "易拉宝2","url": ""},]},
            {"name": "L展架","url": ""},
            {"name": "海报","url": ""},
			{"name": "条幅","url": ""},
			{"name": "大型展架","url": ""},
			{"name": "其他","url": ""}]		
	},
			
    {"name": "礼品",
      "submenu": [
            {"name": "礼品1","url": ""},
            {"name": "礼品2","url": ""},
            {"name": "其他","url": ""}]
    }
];*/
function initMenu() {
  $('#menu ul').hide();
  /*$('#menu ul:first').show();*/
  $('#menu li a').click(
    function() {
      var checkElement = $(this).next();
      if((checkElement.is('ul')) && (checkElement.is(':visible'))) {
    	  $('#menu ul:visible').slideDown('normal');
          checkElement.slideUp('normal');
        return false;
        }
      if((checkElement.is('ul')) && (!checkElement.is(':visible'))) {
        $('#menu ul:visible').slideUp('normal');
        checkElement.slideDown('normal');
        return false;
        }
      }
    );
  }
$(document).ready(function() {initMenu();});
function detail(i){
	document.getElementById('classform'+i).submit();
}
function list(i){
	document.getElementById('cateform'+i).submit();
}
function search(){
	document.getElementById('searchform').submit();
}
function detail2(i){
	document.getElementById('clform'+i).submit();
}
