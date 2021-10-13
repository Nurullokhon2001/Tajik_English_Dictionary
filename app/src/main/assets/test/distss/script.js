
var quiz = { "JS" : [
	{
		"id" : 1,
		"question" : " Look here ",
		"options" : [
			{"a": "Гуш кунед", 
			 "b":"Ин хело хуб;", 
			 "c":"Гурезед", 
			 }
			],
		"answer":"Гуш кунед",
		"score":0,
		"status": ""
	},
	{
		"id" : 2,
		"question" : "Хавотир нашавед",
		"options" : [
			{"a": "i don't саге", 
			 "b":" good job", 
			 "c":"don't worry"}
			],
		"answer":"don't worry",
		"score":0,
		"status": ""
	},
	{
		"id" : 3,
		"question" : "  Calm down",
		"options" : [
			{"a": "Ором", 
			 "b":"Ором бощед", 
			 "c":"зудтар "}
			],
		"answer":"Ором бощед",
		"score":0,
		"status": ""
	},
	{
		"id" : 4,
		"question" : "Гум шав",
		"options" : [
			{"a": " You're cool!", 
			 "b":"So far so good", 
			 "c":"get lost"}
			],
		"answer":"get lost",
		"score":0,
		"status": ""
	},
	{
		"id" : 5,
		"question" : " I wish I knew ",
		"options" : [
			{"a": "Мехостам фахмам", 
			 "b":"Мехостам равам", 
			 "c":"Мехостам бинам"}
			],
		"answer":"Мехостам фахмам",
		"score":0,
		"status": ""
	},
	{
		"id" : 6,
		"question" : "Кори ту набошад",
		"options" : [
			{"a": " I mean it!", 
			 "b":"It' s none of your business", 
			 "c":" It was a success"}
			],
		"answer":"It' s none of your business",
		"score":0,
		"status": ""
	},
	{
		"id" : 7,
		"question" : " Good luck!",
		"options" : [
			{"a": "Хайр", 
			 "b":"барори кор", 
			 "c":"салом "}
			],
		"answer":"барори кор",
		"score":0,
		"status": ""
	},
	{
		"id" : 8,
		"question" : "Write to us ",
		"options" : [
			{"a": "ба мо навис", 
			 "b":"ба мо занг зан", 
			 "c":"ба мо нанавис "}
			],
		"answer":"ба мо навис",
		"score":0,
		"status": ""
	},
	{
		"id" : 9,
		"question" : "Аз дидоратон шодам",
		"options" : [
			{"a": " Tell me about it!", 
			 "b":"You can't really be serious! ", 
			 "c":" I've enjoyed seeing you"}
			],
		"answer":" I've enjoyed seeing you",
		"score":0,
		"status": ""
	},
	{
		"id" : 10,
		"question" : "What's news?",
		"options" : [
			{"a": "Чи хабархои нав?", 
			 "b":"Чи омади?", 
			 "c":"Чи мерави? "}
			],
		"answer":"face",
		"score":0,
		"status": ""
	},
	
	
	
	]
}



var quizApp = function() {

	this.score = 0;		
	this.qno = 1;
	this.currentque = 0;
	var totalque = quiz.JS.length;

	
	this.displayQuiz = function(cque) {
		this.currentque = cque;
		if(this.currentque <  totalque) {
			$("#tque").html(totalque);
			$("#previous").attr("disabled", false);
			$("#next").attr("disabled", false);
			$("#qid").html(quiz.JS[this.currentque].id + '.');
	
			
			$("#question").html(quiz.JS[this.currentque].question);	
			 $("#question-options").html("");
			for (var key in quiz.JS[this.currentque].options[0]) {
			  if (quiz.JS[this.currentque].options[0].hasOwnProperty(key)) {
		
				$("#question-options").append(
					"<div class='form-check option-block'>" +
					"<label class='form-check-label'>" +
							  "<input type='radio' class='form-check-input' name='option'   id='q"+key+"' value='" + quiz.JS[this.currentque].options[0][key] + "'><span id='optionval'>" +
								  quiz.JS[this.currentque].options[0][key] +
							 "</span></label>"
				);
			  }
			}
		}
		if(this.currentque <= 0) {
			$("#previous").attr("disabled", true);	
		}
		if(this.currentque >= totalque) {
				$('#next').attr('disabled', true);
				for(var i = 0; i < totalque; i++) {
					this.score = this.score + quiz.JS[i].score;
				}
			return this.showResult(this.score);	
		}
	}
	
	this.showResult = function(scr) {
		$("#result").addClass('result');
		$("#result").html("<h1 class='res-header'>Хамаги Савол &nbsp;" + scr  + '/' + totalque + "</h1>");
		for(var j = 0; j < totalque; j++) {
			var res;
			if(quiz.JS[j].score == 0) {
					res = '<span class="wrong">' + quiz.JS[j].score + '</span><i class="fa fa-remove c-wrong"></i>';
			} else {
				res = '<span class="correct">' + quiz.JS[j].score + '</span><i class="fa fa-check c-correct"></i>';
			}
			$("#result").append(
			'<div class="result-question"><span>Q ' + quiz.JS[j].id + '</span> &nbsp;' + quiz.JS[j].question + '</div>' +
			'<div><b>Чавоби дуруст:</b> &nbsp;' + quiz.JS[j].answer + '</div>' +
			'<div class="last-row"><b>Балл:</b> &nbsp;' + res +
			
			'</div>' 
			
			);
			
		}
	}
	
	this.checkAnswer = function(option) {
		var answer = quiz.JS[this.currentque].answer;
		option = option.replace(/\</g,"&lt;")   //for <
		option = option.replace(/\>/g,"&gt;")   //for >
		option = option.replace(/"/g, "&quot;")

		if(option ==  quiz.JS[this.currentque].answer) {
			if(quiz.JS[this.currentque].score == "") {
				quiz.JS[this.currentque].score = 1;
				quiz.JS[this.currentque].status = "correct";
		}
		} else {
			quiz.JS[this.currentque].status = "wrong";
		}
		
	}	
	 
	this.changeQuestion = function(cque) {
			this.currentque = this.currentque + cque;
			this.displayQuiz(this.currentque);	
			
	}
	
}


var jsq = new quizApp();

var selectedopt;
	$(document).ready(function() {
			jsq.displayQuiz(0);		
		
	$('#question-options').on('change', 'input[type=radio][name=option]', function(e) {

			//var radio = $(this).find('input:radio');
			$(this).prop("checked", true);
				selectedopt = $(this).val();
		});
		
			
			 
	});

	
	
	
	$('#next').click(function(e) {
			e.preventDefault();
			if(selectedopt) {
				jsq.checkAnswer(selectedopt);
			}
			jsq.changeQuestion(1);
	});	
	
	$('#previous').click(function(e) {
		e.preventDefault();
		if(selectedopt) {
			jsq.checkAnswer(selectedopt);
		}
			jsq.changeQuestion(-1);
	});