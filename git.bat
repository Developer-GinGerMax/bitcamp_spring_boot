:loop

	cd C:\Users\JS_KIM\workspace

	git init
	
	git pull
	
	git add --all
	
	git commit -m "auto commit"
	
	git push
	
	:: 3600초 대기
	TIMEOUT 3600
	
goto loop