1. Кажется ни один из принципов не нарушен.
2. В качестве интерфейса решил назначить "Кого-то". Его могут реализовать "Пользователи", "Наблюдатели" и т.д. и методы у них, по крайней мере значительная часть, будут одинаковыми.
3. "Отчет" и "Сохранение" явно являются отдельными ответственностями. Запихивать их реализацию в один интерфейс не стал, хотя, как мне кажется, можно.
