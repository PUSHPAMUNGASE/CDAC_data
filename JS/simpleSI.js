"use strict";
document.getElementById("btn").onclick = function () {
//    alert('Hello, World!');
  var data1 = document.getElementById("x1").value;
  var data2 = document.getElementById("x2").value;
  var data3 = document.getElementById("x3").value;

  var msg = "";
  if (data1 == "" || data2 == "" || data3 == "") {
    msg = "Please enter all fields";
  } else if (isNaN(data1) || isNaN(data2) || isNaN(data3)) {
    msg = "All fields should contain numeric values!";
  } else if (data1 < 0 || data2 < 0 || data3 < 0) {
    msg = "All fields should contain positive values!";
  } else {
    var p = Number(data1);
    var r = parseFloat(data2);
    var n = parseInt(data3); //typecasting
    r = r / 100;
    n = n;
    var emi = p * r * n;
    console.log(emi);
    var totalPaid = p + emi;
    var totalPaidInterest = totalPaid - p;

    emi = Math.round(emi);
    totalPaid = Math.round(totalPaid);
    totalPaidInterest = Math.round(totalPaidInterest);

    document.getElementById("y1").innerHTML = p;
    document.getElementById("y2").innerHTML = totalPaid;
    document.getElementById("y3").innerHTML = totalPaidInterest;
   

    Highcharts.chart("container", {
      chart: {
        type: "pie",
      },
      title: {
        text: "Egg Yolk Composition",
      },
      tooltip: {
        valueSuffix: "%",
      },
      subtitle: {
        text: 'Source:<a href="https://www.mdpi.com/2072-6643/11/3/684/htm" target="_default">MDPI</a>',
      },
      plotOptions: {
        series: {
          allowPointSelect: true,
          cursor: "pointer",
          dataLabels: [
            {
              enabled: true,
              distance: 20,
            },
            {
              enabled: true,
              distance: -40,
              format: "{point.percentage:.1f}%",
              style: {
                fontSize: "1.2em",
                textOutline: "none",
                opacity: 0.7,
              },
              filter: {
                operator: ">",
                property: "percentage",
                value: 10,
              },
            },
          ],
        },
      },
      series: [
        {
          name: "Percentage",
          colorByPoint: true,
          data: [
            {
              name: "Interest",
              y: totalPaidInterest,
            },
            {
              name: "Loan amount",
              sliced: true,
              selected: true,
              y: p,
            },
          ],
        },
      ],
    });
  }
  document.getElementById("result").innerHTML = msg;
};
