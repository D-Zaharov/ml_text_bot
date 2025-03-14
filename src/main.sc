require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: hello
        intent!: /hello
        a: Привет привет

    state: weather
        intent!: /weather
        a: Погода сегодня классная


    state: currency
        intent!: /currency
        a: Курсы валют плавающие

    state: NoMatch
        event!: noMatch
        a: Я не понял, что вы сказали