jProtractor [![Build Status](http://img.shields.io/travis/caarlos0/jProtractor/master.svg?style=flat)](https://travis-ci.org/caarlos0/jProtractor)
===========

> An angular/protractor implementation for Java Selenium API


## Why?

I imagine that a lot of folks have old projects covered with selenium
tests written in Java, then, developers started to build a new interface
using Angular.js, tests failed and it's not worth it to migrate all
WebPages and Tests to a brand new framework and language. Maybe the
people who write the tests also aren't very good at JS.

In this scenario, you might want the [angular/protractor](http://github.com/angular/protractor)
features without have to do all this migration.

This project has the objective to fix that. Protractor isn't any rocket science
with dark magic inside it, it is just JavaScript and the core Selenium API, so,
it should work.

## Actual state

I just started it. I don't know yet how I will do some features, but I will be
working on it. Feel free to contribute if you want.

## tl;dr: Can I use it yet?

Nope.

## Contributing

- We use TDD here. So don't even submit a pull request without a test;
- Please respect the code formatting rules;
- Describe well the issue you're fixing or the feature you're implementing
in your pull request;
- Needless to say, but, respect the others!

## TODO

- [ ] setup maven-formatter-plugin for java and js;
- [ ] check the packaging that probably is wrong (packing too much);
- [ ] write other selectors and base test class;
- [ ] Rule the world.
