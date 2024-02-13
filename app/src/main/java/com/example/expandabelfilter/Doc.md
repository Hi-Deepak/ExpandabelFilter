# Model
## Row
- name
- children: List<Row>

# Problem
## Events
- Initially display level 1 parents
- On expandBtn.click of a row, add direct children to the list; len=row.children.length
- On collapseBtn.click of a row of level n, keep removing rows below until a row of level >= n is not found