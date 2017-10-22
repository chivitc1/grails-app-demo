<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Grails App demo</title>

	</head>
	<body>
		<div id="welcome">
			<br />
			<h3>Welcome to Grails demo</h3>
			<p>abc xyz</p>
		</div>

	<div class="homeCell">
		<h3>Find a Tek Event</h3>
		<p>Abc xyz</p>
		<span class="buttons">
			<g:link controller="tekEvent" action="index">Find a Tek Event</g:link>
		</span>
	</div>

	<div class="homeCell">
		<h3>Organize a Tek Event</h3>
		<p>Abc Xyz</p>
		<span class="buttons">
			<g:link controller="tekEvent" action="create">Orginaize a Tek Event</g:link>

		</span>
	</div>

	<div class="homeCell">
		<h3>Sponsor a Tek Event</h3>
		<p>If you are part of a business or organization xxxxxxxxxx</p>
		<span class="buttons">
			<g:link controller="sponsor" action="create">Sponsor a Tek Event</g:link>
		</span>
	</div>
	</body>
</html>
